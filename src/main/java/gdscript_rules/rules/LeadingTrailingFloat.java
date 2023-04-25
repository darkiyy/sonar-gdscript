package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.LiteralListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import java.util.List;

@Rule(key = LeadingTrailingFloat.RULE_KEY)
public class LeadingTrailingFloat implements FlagLineRule {
    public static final String RULE_KEY = "LeadingTrailingFloat";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        GDScriptParser parser = FileParserCreator.createParser(file);
        LiteralListener listener = new LiteralListener();
        parser.addParseListener(listener);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.program());

        List<GDScriptParser.LiteralContext> numbers = listener.getFloatNumbers();

        for (GDScriptParser.LiteralContext floatNumber: numbers) {
            boolean startsWithPoint = floatNumber.getText().startsWith(".");
            boolean endsWithPoint = floatNumber.getText().endsWith(".");
            if(startsWithPoint || endsWithPoint)
            {
                int line = floatNumber.start.getLine();
                IssuesContainer.createIssue(ruleKey, file, sensorContext, line);
            }
        }


    }
}

