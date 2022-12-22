package gdscript_rules;

import gdscript_rules.rules.*;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.rule.CheckFactory;
import org.sonar.api.batch.rule.Checks;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import gdscript_language.GDScriptLanguage;

public class FlagLineSensor implements Sensor {

    private final Checks<FlagLineRule> checks;
    public FlagLineSensor(CheckFactory checkFactory) {
        checks = checkFactory.create(FlagLineRuleDefinition.REPO_KEY);
        checks.addAnnotatedChecks(
            LeadingTrailingFloat.class,
            TrailingCommaSingeLineList.class,
            TrailingComma.class,
            BooleanOperators.class,
            UnnecessaryParentheses.class,
            HexNumbersSmall.class,
            UseUnderScoreOnLargeNumbers.class,
            ConstantUpperCase.class,
            EnumerationsUppercase.class
        );
    }

    @Override
    public void describe(SensorDescriptor descriptor) {
        descriptor.name(LeadingTrailingFloat.RULE_KEY + "sensor");
        descriptor.onlyOnLanguages(GDScriptLanguage.KEY);
        descriptor.createIssuesForRuleRepository(FlagLineRuleDefinition.REPO_KEY);
    }

    @Override
    public void execute(SensorContext context) {
        FilePredicates p = context.fileSystem().predicates();
        for (InputFile inputFile : context.fileSystem().inputFiles(p.hasLanguages(GDScriptLanguage.KEY))) {
            checks.all().forEach(check -> check.execute(context, inputFile, checks.ruleKey(check)));
        }
    }
}

