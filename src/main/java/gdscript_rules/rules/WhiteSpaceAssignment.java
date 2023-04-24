package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.AssigmentStmtListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = WhiteSpaceAssignment.RULE_KEY)
public class WhiteSpaceAssignment implements FlagLineRule {
    public static final String RULE_KEY = "WhiteSpaceAssignment";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        // Todo: Create Rule
        GDScriptParser parser = FileParserCreator.createParser(file);
        AssigmentStmtListener listener = new AssigmentStmtListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        for (GDScriptParser.AssignmentStmtContext context: listener.getAsStmt()){

        }
    }
}
