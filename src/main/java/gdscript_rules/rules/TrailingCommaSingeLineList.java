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

@Rule(key = TrailingCommaSingeLineList.RULE_KEY)
public class TrailingCommaSingeLineList implements FlagLineRule {
    public static final String RULE_KEY = "TrailingCommaSingeLineList";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        EnumListener listener = (EnumListener) walker.getListener(EnumListener.class);

        for(GDScriptParser.EnumDeclContext enums: listener.getEnumDecl())
        {
            int listEntries = enums.enumList().IDENTIFIER().size();
            int commaCount = enums.enumList().COMMA().size();

            if(listEntries == commaCount)
            {
                int startLine = enums.enumList().start.getLine();
                int endLine = enums.enumList().stop.getLine();

                if(startLine == endLine)
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, endLine);
            }
        }
    }
}

