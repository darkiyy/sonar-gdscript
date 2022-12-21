package gdscript_settings;
import java.util.List;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import static java.util.Arrays.asList;

public class GDScriptLanguageSettings {
    public static final String FILE_SUFFIXES_KEY = "sonar.gdscript.file.suffixes";
    public static final String FILE_SUFFIXES_DEFAULT_VALUE = ".gd";

    private GDScriptLanguageSettings() {
        // only statics
    }

    public static List<PropertyDefinition> getProperties() {
        return asList(PropertyDefinition.builder(FILE_SUFFIXES_KEY)
                .multiValues(true)
                .defaultValue(FILE_SUFFIXES_DEFAULT_VALUE)
                .category("GDScript")
                .name("File Suffixes")
                .description("List of suffixes for files to analyze.")
                .onQualifiers(Qualifiers.PROJECT)
                .build());
    }
}
