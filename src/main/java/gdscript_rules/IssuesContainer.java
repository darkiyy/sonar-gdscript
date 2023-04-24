package gdscript_rules;

import org.antlr.v4.runtime.ParserRuleContext;
import org.sonar.api.batch.fs.InputFile;

import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;


public class IssuesContainer {

    public static void createIssue(RuleKey ruleKey, InputFile file, SensorContext sensorContext, int line)
    {
        NewIssue newIssue = sensorContext.newIssue();
        newIssue
                .forRule(ruleKey)
                .at(newIssue.newLocation()
                        .on(file)
                        .at(file.selectLine(line)))
                .save();
    }

    public static void createIssue(RuleKey ruleKey, InputFile file, SensorContext sensorContext, ParserRuleContext context)
    {
        int line = context.start.getLine();
        createIssue(ruleKey, file, sensorContext, line);
    }

}