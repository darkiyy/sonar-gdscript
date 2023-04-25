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
@Rule(key = UseUnderScoreOnLargeNumbers.RULE_KEY)
public class UseUnderScoreOnLargeNumbers implements FlagLineRule {
    public static final String RULE_KEY = "UseUnderScoreOnLargeNumbers";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        LiteralListener listener = new LiteralListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());
        int maxNumbers = 6;

        for (GDScriptParser.LiteralContext context: listener.getNumbers()){
            String number = context.INTEGER().getText();

            int numberLength = number.length();
            int hexNumberadd = 0;

            if(number.matches(".*[a-zA-Z].*"))
                hexNumberadd += 4;

            if(numberLength > (maxNumbers + hexNumberadd)) //Numbers lower than 1000000 generally don't need separators.
            {
                if(!number.contains("_")) //IF there is no _ in the long number
                {
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
                }
            }
        }
    }
}
