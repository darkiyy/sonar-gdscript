package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = LeadingTrailingFloat.RULE_KEY)
public class LeadingTrailingFloat implements FlagLineRule {
    public static final String RULE_KEY = "LeadingTrailingFloat";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        GDScriptParser parser = FileParserCreator.createParser(file);
        try
        {
            for (GDScriptParser.TopLevelDeclContext topLvl : parser.program().topLevelDecl()) {
                GDScriptParser.ClassVarDeclContext context = topLvl.classVarDecl();
                String varText = context.expression().getText();

                if (varText.indexOf('.') == 0 || varText.indexOf('.') == (varText.length() - 1)) {
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
                }

            }
        }
        catch(NullPointerException ex)
        {
            //TODO: Do not let this exception happen
            //Continue to Run
        }


    }
}

