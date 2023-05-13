package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.LogicListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import java.beans.Expression;

@Rule(key = BooleanOperators.RULE_KEY)

public class BooleanOperators implements FlagLineRule {
    public static final String RULE_KEY = "BooleanOperators";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        LogicListener listener = (LogicListener) walker.getListener(LogicListener.class);

        for (GDScriptParser.LogicAndContext context: listener.getLogicAndContexts()){
            if(context.LOGIC_AND() != null){
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
            }
        }

        for (GDScriptParser.LogicOrContext context: listener.getLogicOrContexts()){
            if(context.LOGIC_OR() != null){
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
            }
        }
    }

}

