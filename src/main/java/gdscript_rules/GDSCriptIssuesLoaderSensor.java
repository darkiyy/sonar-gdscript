package gdscript_rules;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.xml.stream.XMLStreamException;

import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.config.Configuration;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import gdscript_language.GDScriptLanguage;
public class GDSCriptIssuesLoaderSensor implements Sensor {
    private static final Logger LOGGER = Loggers.get(GDSCriptIssuesLoaderSensor.class);

    protected static final String REPORT_PATH_KEY = "sonar.gdscript.reportPath";

    protected final Configuration config;
    protected final FileSystem fileSystem;
    protected SensorContext context;

    public GDSCriptIssuesLoaderSensor(final Configuration config, final FileSystem fileSystem)
    {
        this.config = config;
        this.fileSystem = fileSystem;
    }

    @Override
    public void describe(final SensorDescriptor descriptor) {
        descriptor.name("FooLint Issues Loader Sensor");
        descriptor.onlyOnLanguage(GDScriptLanguage.KEY);
    }

    protected String reportPathKey() {
        return REPORT_PATH_KEY;
    }

    protected String getReportPath() {
        Optional<String> o = config.get(reportPathKey());
        if (o.isPresent()) {
            return o.get();
        }
        return null;
    }

    @Override
    public void execute(final SensorContext context) {
        LOGGER.info("GDScriptIssuesLoaderSensor start");
        String reportPath = getReportPath();
        if (reportPath != null) {
            this.context = context;
            File analysisResultsFile = new File(reportPath);
            try {
                parseAndSaveResults(analysisResultsFile);
            } catch (XMLStreamException e) {
                throw new IllegalStateException("Unable to parse the provided FooLint file", e);
            }
        }
    }
    protected void parseAndSaveResults(final File file) throws XMLStreamException {

        LOGGER.info("(mock) Parsing 'FooLint' Analysis Results");
        FooLintAnalysisResultsParser parser = new FooLintAnalysisResultsParser();
        List<ErrorDataFromExternalLinter> errors = parser.parse(file);
        for (ErrorDataFromExternalLinter error : errors) {
            getResourceAndSaveIssue(error);
        }
    }

    private void getResourceAndSaveIssue(final ErrorDataFromExternalLinter error) {
        LOGGER.debug(error.toString());

        InputFile inputFile = fileSystem.inputFile(
                fileSystem.predicates().and(
                        fileSystem.predicates().hasRelativePath(error.getFilePath()),
                        fileSystem.predicates().hasType(InputFile.Type.MAIN)));

        LOGGER.debug("inputFile null ? " + (inputFile == null));

        if (inputFile != null) {
            saveIssue(inputFile, error.getLine(), error.getType(), error.getDescription());
        } else {
            LOGGER.error("Not able to find a InputFile with " + error.getFilePath());
        }
    }

    private void saveIssue(final InputFile inputFile, int line, final String externalRuleKey, final String message) {
        RuleKey ruleKey = RuleKey.of(getRepositoryKeyForLanguage(inputFile.language()), externalRuleKey);

        NewIssue newIssue = context.newIssue()
                .forRule(ruleKey);

        NewIssueLocation primaryLocation = newIssue.newLocation()
                .on(inputFile)
                .message(message);
        if (line > 0) {
            primaryLocation.at(inputFile.selectLine(line));
        }
        newIssue.at(primaryLocation);

        newIssue.save();
    }

    private static String getRepositoryKeyForLanguage(String languageKey) {
        return languageKey.toLowerCase() + "-" + FlagLineRuleDefinition.KEY;
    }

    @Override
    public String toString() {
        return "FooLintIssuesLoaderSensor";
    }

    private class ErrorDataFromExternalLinter {

        private final String externalRuleId;
        private final String issueMessage;
        private final String filePath;
        private final int line;

        public ErrorDataFromExternalLinter(final String externalRuleId, final String issueMessage, final String filePath, final int line) {
            this.externalRuleId = externalRuleId;
            this.issueMessage = issueMessage;
            this.filePath = filePath;
            this.line = line;
        }

        public String getType() {
            return externalRuleId;
        }

        public String getDescription() {
            return issueMessage;
        }

        public String getFilePath() {
            return filePath;
        }

        public int getLine() {
            return line;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append(externalRuleId);
            s.append("|");
            s.append(issueMessage);
            s.append("|");
            s.append(filePath);
            s.append("(");
            s.append(line);
            s.append(")");
            return s.toString();
        }
    }

    private class FooLintAnalysisResultsParser {

        public List<ErrorDataFromExternalLinter> parse(final File file) throws XMLStreamException {
            LOGGER.info("Parsing file {}", file.getAbsolutePath());

            // as the goal of this example is not to demonstrate how to parse an xml file we return an hard coded list of FooError

            ErrorDataFromExternalLinter fooError1 = new ErrorDataFromExternalLinter("ExampleRule1", "More precise description of the error", "Scripte/Test.gd", 5);
            return Arrays.asList(null);
        }
    }
}
