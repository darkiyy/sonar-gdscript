package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.EnumListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import gdscript_rules.GDScriptParserWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

import java.util.List;

@Rule(key = EnumerationsUppercase.RULE_KEY)

public class EnumerationsUppercase implements FlagLineRule {
    public static final String RULE_KEY = "EnumerationsUppercase";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        EnumListener listener = (EnumListener) walker.getListener(EnumListener.class);

        for(GDScriptParser.EnumDeclContext enums: listener.getEnumDecl())
        {
            List<TerminalNode> listEntries = enums.enumList().IDENTIFIER();

            for (TerminalNode identifier: listEntries) {
                String entry = identifier.getText();
                String entryUpper = entry.toUpperCase();

                if(!entry.equals(entryUpper)) // IF entry is not in Uppercase
                {
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, enums);
                }
            }
        }

    }
}
