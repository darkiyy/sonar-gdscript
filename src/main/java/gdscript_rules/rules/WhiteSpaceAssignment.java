package gdscript_rules.rules;

import gdscript_rules.FlagLineRule;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = WhiteSpaceAssignment.RULE_KEY)
public class WhiteSpaceAssignment implements FlagLineRule {
    public static final String RULE_KEY = "WhiteSpaceAssignment";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        // Todo: Create Rule

    }
}
