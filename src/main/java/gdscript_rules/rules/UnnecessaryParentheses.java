package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.GDScriptIfStmtListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = UnnecessaryParentheses.RULE_KEY, name = "Avoid unnecessary parentheses", description = "Avoid parentheses in expressions and conditional statements. Unless necessary for order of operations or wrapping over multiple lines, they only reduce readability.")

public class UnnecessaryParentheses implements FlagLineRule {
    public static final String RULE_KEY = "UnnecessaryParentheses";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);

        GDScriptIfStmtListener listener = new GDScriptIfStmtListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());


        for (GDScriptParser.IfStmtContext context: listener.getLogicAndContexts()){
            if(context.OPEN_PAREN().size() != 0){
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

