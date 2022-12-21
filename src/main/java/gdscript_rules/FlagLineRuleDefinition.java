package gdscript_rules;

import gdscript_language.GDScriptLanguage;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionAnnotationLoader;

public final class FlagLineRuleDefinition implements RulesDefinition {

    static final String KEY = "flagLine";
    public static final String REPO_KEY = GDScriptLanguage.KEY + "-" + KEY;
    private static final String REPO_NAME = GDScriptLanguage.KEY + "- " + KEY + " repo";

    @Override
    public void define(Context context) {
        NewRepository repository = context.createRepository(REPO_KEY, GDScriptLanguage.KEY).setName(REPO_NAME);

        RulesDefinitionAnnotationLoader rulesDefinitionAnnotationLoader = new RulesDefinitionAnnotationLoader();
        rulesDefinitionAnnotationLoader.load(repository, LeadingTrailingFloat.class);
        rulesDefinitionAnnotationLoader.load(repository, TrailingCommaSingeLineList.class);
        repository.done();
    }

}