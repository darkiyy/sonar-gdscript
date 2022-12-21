package gdscript_rules;

import gdscript_language.GDScriptLexer;
import gdscript_language.GDScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = LeadingTrailingFloat.RULE_KEY, name = "Leading or trailing zero in floating-point numbers", description = "Don't omit the leading or trailing zero in floating-point numbers. Otherwise, this makes them less readable and harder to distinguish from integers at a glance.")
public class LeadingTrailingFloat implements FlagLineRule {
    public static final String RULE_KEY = "LeadingTrailingFloat";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        try {
            CharStream x = CharStreams.fromString(file.contents());
            GDScriptLexer y = new GDScriptLexer(x);
            CommonTokenStream tokens = new CommonTokenStream(y);

            GDScriptParser parser = new GDScriptParser(tokens);

            for (GDScriptParser.TopLevelDeclContext topLvl : parser.program().topLevelDecl()) {
                GDScriptParser.ClassVarDeclContext classVarDec = topLvl.classVarDecl();
                String varText = classVarDec.expression().getText();

                if (varText.indexOf('.') == 0 || varText.indexOf('.') == (varText.length() - 1)) {
                    NewIssue newIssue = sensorContext.newIssue();
                    newIssue
                            .forRule(ruleKey)
                            .at(newIssue.newLocation()
                                    .on(file)
                                    .at(file.selectLine(classVarDec.start.getLine())))
                            .save();
                }

            }
        }
        catch(Exception ex){
            //TODO: Do something
        }


    }
}

