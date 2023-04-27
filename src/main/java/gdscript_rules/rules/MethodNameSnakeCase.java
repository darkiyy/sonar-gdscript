package gdscript_rules.rules;
import gdscript_language.GDScriptParser;
import gdscript_language.listener.MethodDeclListener;
import gdscript_language.GDScriptParser.MethodDeclContext;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
import org.sonar.check.RuleProperty;


@Rule(key = "MethodSnakeCase")

public class MethodNameSnakeCase implements FlagLineRule {
    private boolean MethodSnakeCase;
    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        MethodDeclListener listener = new MethodDeclListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

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
