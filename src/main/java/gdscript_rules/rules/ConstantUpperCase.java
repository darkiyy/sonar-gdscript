package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.GDScriptConstantListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = ConstantUpperCase.RULE_KEY, name = "Write constants with CONSTANT_CASE", description = "Write constants with CONSTANT_CASE, that is to say in all caps with an underscore (_) to separate words")
public class ConstantUpperCase implements FlagLineRule {
    public static final String RULE_KEY = "ConstantUpperCase";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        GDScriptConstantListener listener = new GDScriptConstantListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        for (GDScriptParser.ConstDeclContext context: listener.getConstDecl()){
            String constantName = context.IDENTIFIER().getText();
            if(constantName.equals(constantName.toLowerCase()))
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
