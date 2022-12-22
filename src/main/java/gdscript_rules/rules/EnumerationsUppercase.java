package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.GDScriptEnumListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = EnumerationsUppercase.RULE_KEY, name = "Use PascalCase für enum names", description = "Use PascalCase for enum names and CONSTANT_CASE for their members, as they are constants:")
public class EnumerationsUppercase implements FlagLineRule {
    public static final String RULE_KEY = "EnumerationsUppercase";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        GDScriptEnumListener listener = new GDScriptEnumListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        for (GDScriptParser.EnumDeclContext context: listener.getEnumDecl()){
            for(int i = 1; i < context.IDENTIFIER().size(); i++){

                String enumIdent = context.IDENTIFIER(i).getText();

                if(enumIdent.equals(enumIdent.toLowerCase()))
                {
                    int line = context.start.getLine();
                    NewIssue newIssue = sensorContext.newIssue();
                    newIssue
                            .forRule(ruleKey)
                            .at(newIssue.newLocation()
                                    .on(file)
                                    .at(file.selectLine(line)))
                            .save();
                    break; // Break the loop, so that the error is only shown once
                }
            }
        }

    }
}
