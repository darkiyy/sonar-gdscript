package gdscript_rules;

import gdscript_language.GDScriptLanguage;
import gdscript_settings.GDScriptLanguageSettings;
import org.sonar.api.SonarRuntime;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonarsource.analyzer.commons.RuleMetadataLoader;
import java.util.List;

public final class FlagLineRuleDefinition implements RulesDefinition {

    static final String KEY = "flagLine";
    public static final String REPO_KEY = GDScriptLanguage.KEY + "-" + KEY;
    private static final String REPO_NAME = GDScriptLanguage.KEY + "- " + KEY + " repo";
    private final SonarRuntime sonarRuntime;
    public FlagLineRuleDefinition(SonarRuntime sonarRuntime){
        this.sonarRuntime = sonarRuntime;
    }
    @Override
    public void define(Context context) {
        List<Class<?>> checkClasses = RulesList.getGDScriptCheck();

        NewRepository repository = context.createRepository(REPO_KEY, GDScriptLanguage.KEY).setName(REPO_NAME);
        RuleMetadataLoader ruleMetadataLoader = new RuleMetadataLoader(GDScriptLanguageSettings.RULE_BASE_PATH, sonarRuntime);
        ruleMetadataLoader.addRulesByAnnotatedClass(repository, checkClasses);

        repository.done();
    }

}
