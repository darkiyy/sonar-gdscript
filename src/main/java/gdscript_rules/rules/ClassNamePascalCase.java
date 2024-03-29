package gdscript_rules.rules;
import gdscript_language.GDScriptParser;
import gdscript_language.listener.ClassNameListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;


@Rule(key = "ClassNamePascalCase")

public class ClassNamePascalCase implements FlagLineRule {

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {


        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        ClassNameListener listener = (ClassNameListener) walker.getListener(ClassNameListener.class);
        GDScriptParser.ClassNameContext classContext = listener.getClassName();

        if(classContext != null)
        {
            String className = classContext.IDENTIFIER().getText();

            if(!className.startsWith("\""))
            {
                Character firstChar = className.charAt(0);
                if(Character.isLowerCase(firstChar))
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, classContext);
            }
        }
    }
}
