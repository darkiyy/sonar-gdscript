package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.EnumListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = TrailingComma.RULE_KEY)
public class TrailingComma implements FlagLineRule {
    public static final String RULE_KEY = "TrailingComma";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        EnumListener listener = (EnumListener) walker.getListener(EnumListener.class);

        for(GDScriptParser.EnumDeclContext enums: listener.getEnumDecl())
        {
            int listEntries = enums.enumList().IDENTIFIER().size();
            int commaCount = enums.enumList().COMMA().size();

            int listStart = enums.enumList().start.getLine();
            int listEnd = enums.enumList().stop.getLine();

            boolean onOneLine = listStart == listEnd;

            if(listEntries != commaCount && !onOneLine) // If all entries are on the same line, there is no comma needed
            {
                int errorLine = enums.enumList().stop.getLine();
                IssuesContainer.createIssue(ruleKey, file, sensorContext, errorLine);
            }
        }
    }
}

