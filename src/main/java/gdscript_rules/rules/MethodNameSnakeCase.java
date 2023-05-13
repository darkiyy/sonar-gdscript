package gdscript_rules.rules;
import gdscript_language.listener.MethodDeclListener;
import gdscript_language.GDScriptParser.MethodDeclContext;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;


@Rule(key = "MethodSnakeCase")

public class MethodNameSnakeCase implements FlagLineRule {
    private boolean MethodSnakeCase;
    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        MethodDeclListener listener = (MethodDeclListener) walker.getListener(MethodDeclListener.class);

        for (MethodDeclContext context: listener.getMethodDecl()){
            String methodIdentifier = context.IDENTIFIER().getText();
            Character firstChar = methodIdentifier.charAt(0);

            if(Character.isUpperCase(firstChar)) // If the character is not large, if requiered, then create an Issue
            {
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
            }
        }

    }
}
