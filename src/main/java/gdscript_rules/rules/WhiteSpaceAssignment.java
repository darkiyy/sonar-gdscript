package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.GDScriptAssigmentStmtListener;
import gdscript_language.listener.GDScriptIfStmtListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;
@Rule(key = WhiteSpaceAssignment.RULE_KEY, name = "Whitespace missing around operators", description = "Always use one space around operators and after commas. Also, avoid extra spaces in dictionary references and function calls.")
public class WhiteSpaceAssignment implements FlagLineRule {
    public static final String RULE_KEY = "WhiteSpaceAssignment";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);
        GDScriptAssigmentStmtListener listener = new GDScriptAssigmentStmtListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        for (GDScriptParser.AssignmentStmtContext context: listener.getAsStmt()){

        }

    }
}