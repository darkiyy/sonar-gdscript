package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_rules.FlagLineRule;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = TrailingComma.RULE_KEY, name = "Trailing comma in lists", description = "Use a trailing comma on the last line in arrays, dictionaries, and enums. This results in easier refactoring and better diffs in version control as the last line doesn't need to be modified when adding new elements.")
public class TrailingComma implements FlagLineRule {
    public static final String RULE_KEY = "TrailingComma";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);

        for(GDScriptParser.TopLevelDeclContext topLvlCont: parser.program().topLevelDecl())
        {
            if(topLvlCont.enumDecl() != null && topLvlCont.enumDecl().start.getLine() != topLvlCont.enumDecl().stop.getLine())
            {
                int size = topLvlCont.enumDecl().children.size();
                String lastChild = topLvlCont.enumDecl().children.get(size-2).getText();
                int line = topLvlCont.enumDecl().stop.getLine();

                if(!lastChild.equals(","))
                {
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
}

