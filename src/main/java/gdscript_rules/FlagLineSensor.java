package gdscript_rules;

import gdscript_rules.rules.*;
import org.apache.commons.lang.StringUtils;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.rule.CheckFactory;
import org.sonar.api.batch.rule.Checks;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import gdscript_language.GDScriptLanguage;
import org.sonar.api.measures.CoreMetrics;

import static gdscript_language.listener.MethodDeclListener.getMethodCount;
import static gdscript_language.listener.NormalStmtListener.getStatementCount;

public class FlagLineSensor implements Sensor {

    private final Checks<FlagLineRule> checks;
    public FlagLineSensor(CheckFactory checkFactory) {
        checks = checkFactory.create(FlagLineRuleDefinition.REPO_KEY);
        checks.addAnnotatedChecks(RulesList.getGDScriptCheck());
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
            try
            {
                String fileContents = inputFile.contents();
                int lineCount = StringUtils.countMatches(fileContents, "\n");

                MetricContainer.saveMeasure(context, inputFile, CoreMetrics.NCLOC, lineCount);
                MetricContainer.saveMeasure(context, inputFile, CoreMetrics.FUNCTIONS, getMethodCount(inputFile));
                MetricContainer.saveMeasure(context, inputFile, CoreMetrics.COMMENT_LINES, 0); // Todo, using ANTLR4 pretty hard
                MetricContainer.saveMeasure(context, inputFile, CoreMetrics.STATEMENTS, getStatementCount(inputFile));
            }
            catch(Exception ex)
            {

            }
            // Count the number of lines in the file

        }

    }

}

