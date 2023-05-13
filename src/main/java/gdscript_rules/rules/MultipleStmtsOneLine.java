package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.NormalStmtListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
import java.util.HashSet;
import java.util.Set;


@Rule(key = "MultipleStmtsOneLine")
public class MultipleStmtsOneLine implements FlagLineRule {

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        NormalStmtListener listener = (NormalStmtListener) walker.getListener(NormalStmtListener.class);

        Set<Integer> lineSet = new HashSet<>();
        Set<Integer> markedLines = new HashSet<>();

        for(GDScriptParser.StmtContext context: listener.getStmts()){
            int stmtLine = context.start.getLine();
            if(!lineSet.add(stmtLine)){ //Sets do not allow duplicate values
                if(markedLines.add(stmtLine)){ //Only mark the line once
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, stmtLine);
                }
            }
        }
    }
}
