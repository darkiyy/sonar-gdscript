package gdscript_rules;

import org.sonar.api.batch.fs.InputFile;

import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;


public class IssuesContainer {

    public static void createIssue(String ruleKey, InputFile file, SensorContext sensorContext, int line)
    {
        createIssue(ruleKey, file, sensorContext, line, 0);
    }

    public static void createIssue(String ruleKey, InputFile file, SensorContext sensorContext, int line, double gap)
    {

        NewIssue newIssue = sensorContext.newIssue();
        newIssue
                .forRule(RuleKey.parse(ruleKey))
                .at(newIssue.newLocation()
                        .on(file)
                        .at(file.selectLine(line)))
                .gap(gap)
                .save();
    }


}