package gdscript_rules.rules;

import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
import org.sonar.check.RuleProperty;

@Rule(key = "LineLength")
public class LineLength implements FlagLineRule {
    @RuleProperty(key = "maximumLineLength", defaultValue = "100", description = "The maximum number of characters allowed in a single line of code.")
    private int maximumLineLength;
    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        for(int i = 1; i <= file.lines(); i++) // Check each line inside the file
        {
            int startLine = file.selectLine(i).start().lineOffset();
            int endLine = file.selectLine(i).end().lineOffset();

            int lineLength = endLine - startLine;

            if(maximumLineLength < lineLength)
            {
                int errorLine = i;
                IssuesContainer.createIssue(ruleKey, file, sensorContext, errorLine);
            }
        }

    }
}
