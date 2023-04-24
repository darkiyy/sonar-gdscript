package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.IntegerListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = HexNumbersSmall.RULE_KEY)
public class HexNumbersSmall implements FlagLineRule {
    public static final String RULE_KEY = "HexNumbersSmall";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        IntegerListener listener = new IntegerListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());
        String number = "";
        for (GDScriptParser.LiteralContext context: listener.getNumbers()){
            number = context.INTEGER().getText();
            if(!number.equals(number.toLowerCase()))
            {
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
            }
        }

    }
}

