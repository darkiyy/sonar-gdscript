package gdscript_language;
import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;
import gdscript_settings.GDScriptLanguageSettings;

public class GDScriptLanguage extends AbstractLanguage{

    public static final String NAME = "GDScript";
    public static final String KEY = "gdscript";

    private final Configuration config;

    public GDScriptLanguage(Configuration config) {
        super(KEY, NAME);
        this.config = config;
    }

    @Override
    public String[] getFileSuffixes() {
        return config.getStringArray(GDScriptLanguageSettings.FILE_SUFFIXES_KEY);
    }
}
