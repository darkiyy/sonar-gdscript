package gdscript;
import gdscript_language.GDScriptLanguage;
import gdscript_language.GDScriptQualityProfile;
import gdscript_settings.GDScriptLanguageSettings;
import org.sonar.api.Plugin;
import gdscript_rules.*;

public class GDScriptPlugin implements Plugin{

    @Override
    public void define(Context context) {
        context.addExtensions(GDScriptLanguage.class, GDScriptQualityProfile.class);
        context.addExtensions(GDScriptLanguageSettings.getProperties());

        context.addExtensions(FlagLineRuleDefinition.class, FlagLineSensor.class, GDSCriptIssuesLoaderSensor.class);
    }
}
