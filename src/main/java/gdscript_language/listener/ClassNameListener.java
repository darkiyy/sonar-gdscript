package gdscript_language.listener;

import gdscript_language.GDScriptParser.ClassNameContext;


public class ClassNameListener extends GDScriptParserBaseListener {
    private ClassNameContext className;

    @Override
    public void enterClassName(ClassNameContext ctx) {

        if(ctx.CLASS_NAME() != null)
            className = ctx;

    }

    public ClassNameContext getClassName() {
        return className;
    }

}
