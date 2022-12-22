package gdscript_rules;

import gdscript_language.GDScriptLanguage;

import gdscript_rules.rules.*;
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
        rulesDefinitionAnnotationLoader.load(repository, TrailingComma.class);
        rulesDefinitionAnnotationLoader.load(repository, BooleanOperators.class);
        rulesDefinitionAnnotationLoader.load(repository, UnnecessaryParentheses.class);
        rulesDefinitionAnnotationLoader.load(repository, HexNumbersSmall.class);
        rulesDefinitionAnnotationLoader.load(repository, UseUnderScoreOnLargeNumbers.class);
        rulesDefinitionAnnotationLoader.load(repository, ConstantUpperCase.class);
        rulesDefinitionAnnotationLoader.load(repository, EnumerationsUppercase.class);
        repository.done();
    }

}
