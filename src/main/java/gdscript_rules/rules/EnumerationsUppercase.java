package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.EnumListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = EnumerationsUppercase.RULE_KEY)

public class EnumerationsUppercase implements FlagLineRule {
    public static final String RULE_KEY = "EnumerationsUppercase";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        EnumListener listener = new EnumListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        for (GDScriptParser.EnumDeclContext context: listener.getEnumDecl()){
            for(int i = 1; i < context.IDENTIFIER().size(); i++){

                String enumIdent = context.IDENTIFIER(i).getText();

                if(enumIdent.equals(enumIdent.toLowerCase()))
                {
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
                    break; // Break the loop, so that the error is only shown once
                }
            }
        }

    }
}
