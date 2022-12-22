package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.GDScriptIntegerListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = HexNumbersSmall.RULE_KEY, name = "Write hexadecimal numbers in lowercase", description = "Use lowercase for letters in hexadecimal numbers, as their lower height makes the number easier to read.")
public class HexNumbersSmall implements FlagLineRule {
    public static final String RULE_KEY = "HexNumbersSmall";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        GDScriptIntegerListener listener = new GDScriptIntegerListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());
        String number = "";
        for (GDScriptParser.LiteralContext context: listener.getNumbers()){
            number = context.INTEGER().getText();
            if(!number.equals(number.toLowerCase()))
            {
                int line = context.start.getLine();

                NewIssue newIssue = sensorContext.newIssue();
                newIssue
                    .forRule(ruleKey)
                    .at(newIssue.newLocation()
                            .on(file)
                            .at(file.selectLine(line)))
                    .save();
            }
        }

    }
}

