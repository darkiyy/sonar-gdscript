package gdscript_language;
import gdscript_rules.*;
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
        profile.done();
    }

}
