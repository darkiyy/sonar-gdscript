package gdscript_rules;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = TestRule2.RULE_KEY, name = "Example rule 1", description = "Example rule 1 description")
public class TestRule2 implements FlagLineRule {
    public static final String RULE_KEY = "ExampleRule1";
    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        try
        {
            /*GDScriptLexer lexer = new GDScriptLexer(file.contents().toString());
            Token x = lexer.nextToken();

            if(x)
            {

            }*/
            NewIssue newIssue = sensorContext.newIssue();
            newIssue
                    .forRule(ruleKey)
                    .at(newIssue.newLocation()
                            .on(file)
                            .at(file.selectLine(1)))
                    .save();
        }
        catch(Exception ex)
        {

        }


    }
}

