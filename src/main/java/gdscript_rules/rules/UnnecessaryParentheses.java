package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_language.listener.IfStmtListener;
import gdscript_language.listener.WhileStmtListener;
import gdscript_rules.FlagLineRule;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = UnnecessaryParentheses.RULE_KEY)


public class UnnecessaryParentheses implements FlagLineRule {
    public static final String RULE_KEY = "UnnecessaryParentheses";
    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);

        IfStmtListener listener = new IfStmtListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());


        for (GDScriptParser.IfStmtContext context: listener.getLogicAndContexts()){
            if(context.OPEN_PAREN().size() != 0){
                int line = context.start.getLine();
                NewIssue newIssue = sensorContext.newIssue();

                newIssue
                .forRule(ruleKey)
                .at(newIssue.newLocation()
                    .on(file)
                    .at(file.selectLine(line)))
                .save();
            }
        }
        parser.reset();

        WhileStmtListener whilelistener = new WhileStmtListener();
        walker.walk(whilelistener, parser.program());

        for (GDScriptParser.WhileStmtContext context: whilelistener.getWhileContexts()){
            if(context.expression().children.get(0).getText().equals("(")){ //Only if there are unnecessary Parenthesess the first child will be a (
                int line = context.start.getLine();
                NewIssue newIssue = sensorContext.newIssue();
                newIssue
                    .forRule(ruleKey)
                    .at(newIssue.newLocation()
                        .on(file)
                        .at(file.selectLine(line)))
                    .save();
            }
        }
    }
}

