package gdscript_language;
import gdscript_settings.GDScriptLanguageSettings;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonarsource.analyzer.commons.BuiltInQualityProfileJsonLoader;

import static gdscript_rules.FlagLineRuleDefinition.REPO_KEY;
public class GDScriptQualityProfile implements BuiltInQualityProfilesDefinition{
    public static final String PROFILE_PATH = GDScriptLanguageSettings.RULE_BASE_PATH + "/built-in-profile.json";
    @Override
    public void define(Context context) {
        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("GDScript Rules", GDScriptLanguage.KEY);
        profile.setDefault(true);
        BuiltInQualityProfileJsonLoader.load(profile, REPO_KEY, PROFILE_PATH);

        profile.done();
    }

}
