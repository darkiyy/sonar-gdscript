package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.IfStmtListener;
import gdscript_language.listener.WhileStmtListener;
import gdscript_rules.FlagLineRule;
import gdscript_rules.GDScriptParserWalker;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = UnnecessaryParentheses.RULE_KEY)


public class UnnecessaryParentheses implements FlagLineRule {
    public static final String RULE_KEY = "UnnecessaryParentheses";
    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParserWalker walker = GDScriptParserWalker.getInstance();
        walker.parseFile(file);
        IfStmtListener listener = (IfStmtListener) walker.getListener(IfStmtListener.class);

        for (GDScriptParser.ExpressionContext context: listener.getIfExpressions()){
            String expression = context.getText();
            if(expression.startsWith("(") && expression.endsWith(")"))
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
        }

        WhileStmtListener whileListener = (WhileStmtListener) walker.getListener(WhileStmtListener.class);

        for (GDScriptParser.ExpressionContext context: whileListener.getWhileStmtsExpression()){
            String expression = context.getText();
            if(expression.startsWith("(") && expression.endsWith(")"))
                IssuesContainer.createIssue(ruleKey, file, sensorContext, context);
        }
    }
}

