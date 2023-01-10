package gdscript_rules;

import gdscript_rules.rules.*;

import java.util.Arrays;
import java.util.List;

public class RulesList {
    public static List<Class<?>> getGDScriptCheck() {
        return Arrays.asList(
                ConstantUpperCase.class,
                BooleanOperators.class,
                EnumerationsUppercase.class,
                HexNumbersSmall.class,
                LeadingTrailingFloat.class,
                TrailingComma.class,
                TrailingCommaSingeLineList.class,
                UnnecessaryParentheses.class,
                UseUnderScoreOnLargeNumbers.class
        );
    }
}
