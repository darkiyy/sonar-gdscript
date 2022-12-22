package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.GDScriptAssigmentStmtListener;
import gdscript_language.listener.GDScriptIfStmtListener;
import gdscript_language.listener.GDScriptIntegerListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = UseUnderScoreOnLargeNumbers.RULE_KEY, name = "Use underscore on large numbers", description = "Take advantage of GDScript's underscores in literals to make large numbers more readable.")
public class UseUnderScoreOnLargeNumbers implements FlagLineRule {
    public static final String RULE_KEY = "UseUnderScoreOnLargeNumbers";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        GDScriptIntegerListener listener = new GDScriptIntegerListener();

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
}
