package gdscript_language;
import gdscript_rules.rules.BooleanOperators;
import gdscript_rules.rules.*;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;

import static gdscript_rules.FlagLineRuleDefinition.REPO_KEY;
public class GDScriptQualityProfile implements BuiltInQualityProfilesDefinition{
    @Override
    public void define(Context context) {
        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("GDScript Rules", GDScriptLanguage.KEY);
        profile.setDefault(true);

        NewBuiltInActiveRule LeadingTrailingFloatRule = profile.activateRule(REPO_KEY, LeadingTrailingFloat.RULE_KEY);
        LeadingTrailingFloatRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule TrailingCommaSingeLineListRule = profile.activateRule(REPO_KEY, TrailingCommaSingeLineList.RULE_KEY);
        TrailingCommaSingeLineListRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule TrailingCommaRule = profile.activateRule(REPO_KEY, TrailingComma.RULE_KEY);
        TrailingCommaRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule BooleanOperatorsRule = profile.activateRule(REPO_KEY, BooleanOperators.RULE_KEY);
        BooleanOperatorsRule.overrideSeverity("BLOCKER");
        profile.done();
    }

}
