package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.ConstantListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = ConstantUpperCase.RULE_KEY)
public class ConstantUpperCase implements FlagLineRule {
    public static final String RULE_KEY = "ConstantUpperCase";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        ConstantListener listener = (ConstantListener) walker.getListener(ConstantListener.class);

        for (GDScriptParser.ConstDeclContext context: listener.getConstDecl()){
            String constantName = context.IDENTIFIER().getText();
            if(constantName.equals(constantName.toLowerCase()))
            {
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
            }
        }

    }
}
