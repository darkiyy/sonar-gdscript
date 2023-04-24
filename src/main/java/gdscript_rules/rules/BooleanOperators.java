package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.LogicListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = BooleanOperators.RULE_KEY)

public class BooleanOperators implements FlagLineRule {
    public static final String RULE_KEY = "BooleanOperators";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        LogicListener listener = new LogicListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        for (GDScriptParser.LogicAndContext context: listener.getLogicAndContexts()){
            if(context.LOGIC_AND() != null){
                int line = context.start.getLine();
                NewIssue newIssue = sensorContext.newIssue();
                newIssue
                .forRule(ruleKey)
                .at(newIssue.newLocation()
                    .on(file)
                    .at(file.selectLine(line)))
                .save();
            }
        }

        for (GDScriptParser.LogicOrContext context: listener.getLogicOrContexts()){
            if(context.LOGIC_OR() != null){
                int line = context.start.getLine();
                NewIssue newIssue = sensorContext.newIssue();
                newIssue
                    .forRule(ruleKey)
                    .at(newIssue.newLocation()
                        .on(file)
                        .at(file.selectLine(line)))
                    .save();
            }

        }

    }
}

