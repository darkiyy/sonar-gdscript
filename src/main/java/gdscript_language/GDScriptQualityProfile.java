package gdscript_language;
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

        NewBuiltInActiveRule UnnecessaryParenthesesRule = profile.activateRule(REPO_KEY, UnnecessaryParentheses.RULE_KEY);
        UnnecessaryParenthesesRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule HexNumbersSmallRule = profile.activateRule(REPO_KEY, HexNumbersSmall.RULE_KEY);
        HexNumbersSmallRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule UseUnderScoreOnLargeNumbersRule = profile.activateRule(REPO_KEY, UseUnderScoreOnLargeNumbers.RULE_KEY);
        UseUnderScoreOnLargeNumbersRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule ConstantUpperCaseRule = profile.activateRule(REPO_KEY, ConstantUpperCase.RULE_KEY);
        ConstantUpperCaseRule.overrideSeverity("BLOCKER");

        NewBuiltInActiveRule EnumerationsUppercaseRule = profile.activateRule(REPO_KEY, EnumerationsUppercase.RULE_KEY);
        ConstantUpperCaseRule.overrideSeverity("BLOCKER");

        profile.done();
    }

}
