package gdscript_rules.rules;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;


@Rule(key = "FileNameSnakeCase")

public class FileNameSnakeCase implements FlagLineRule {

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        String fileName = file.filename();
        Character firstChar = fileName.charAt(0);
        if(Character.isUpperCase(firstChar))
            IssuesContainer.createIssue(ruleKey, file, sensorContext, 1);

    }
}
