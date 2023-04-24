
GDScript SonarQube Plugin
==========

A basic GDScript Plugin for SonarQube 9.x
Tested with Godot 3.

The plugin isn't nearly finished. It is terrible in many ways.

Godot 4 has added things for GDScript, when these are used, there might be issues with the interpreter.

Rules
-----
Currently, there are 11 rules implemented:
<ol>  
<li>Avoid unnecessary parentheses</li>  
<li>Multiple statements in one line (BETA, doesn't work well)</li>  
<li>Too many characters in one line</li>  
<li>Trailing comma in lists</li>
<li>Trailing comma in single-line lists</li>
<li>Use PascalCase for enum names</li>
<li>Use the English versions of the boolean operators</li>
<li>Use underscore on large numbers</li>
<li>void leading or trailing zero in floating-point numbers</li>
<li>Write constants with CONSTANT_CASE</li>
<li>Write hexadecimal numbers in lowercase</li>
</ol>

I will add/repair rules if requested.

Plugin
--------

The Interpreter of this plugin is currently using ANTLR4, the interpreted is based on the [grammars-v4](https://github.com/antlr/grammars-v4) repository. It did not work well for me, so I edited it every time I found some kind of issue.
Because the interpreter is not perfect in any means, there might be files which will not be scanned at all.

If you find some issues, like false-positives or false-negatives, you may report them here.
Necessary information:
 <ol>  
<li>What rule is being detected wrong</li>  
<li>The code or a screenshot of the code</li>  
</ol>
The Issue will be most likely because of a misinterpretation of the code, or my incompetence.

Todo
---------

### SSLR:
<ul>  
<li>Creating the Interpreter</li>  
<li>Rewriting all the rules</li>  
<li>Creating a SSLR-Toolkit</li>  
<li>Creating a XPath rule template</li>  
</ul>
SSLR is the Sonar Source Language Recognizer, basically a interpreter like ANTLR4 but created by Sonar. It might be easier creating rules using it instead of ANTLR4. 

### Rules:
Currently, the "Multiple statements in one line" rule has to be fixed. There are way too many false-positives and false-negatives. So you might want to disable it in the quality profile.



Some rules from the [Godot Styleguide](https://docs.godotengine.org/en/stable/tutorials/scripting/gdscript/gdscript_styleguide.html)  are not implemented yet. They have to be added.

### Coverage:
Code coverage from the [gdUnit](https://mikeschulze.github.io/gdUnit3/) should be possible, but I have to look into it.

### Metrics:
<ul>  
<li>No comments line of codes</li>  
<li>Code duplication (no clue on how to get this running)</li> 
</ul>

Adding rules
---
This is a pretty rough summary on how to add a rule.
I might add a rule, if requested, so no other person has to look at this abomination of code.

Under *src/main/resources* is the basic rule definition.
<ul>  
<li>What's the name of the rule</li>  
<li>What type is it (bug, code_smell...)</li>  
<li>The description, which will be visible inside the report</li>  
<li>...</li>  
</ul>
These are defined in the .json file.
The HTML file includes the description when inspecting the rule.
You need both, for the plugin to work.

The rules itself is defined under *src/main/java/gdscript_rules/rules*
You might want to look into a already created rule, to understand it better.

The execute function of the rule class, is checking a file for the issues. The grammar has a listener for many things. You can find these in the *src/main/java/gdscript_language/listener/GDScriptParserBaseListener* class.
Every time I needed a listener, I created a new class for that specific listener.

After you created the rule, you add it to the *src/main/java/gdscript_rules/RulesList.java* class and to the 
*src/main/resources/built-in-profile.json*

To compile the plugin, go in the root folder (where src, scripts... is) and run the *mvn clean package* command. The plugin will be inside the *target* folder.

XPath:
Currently, there is no XPath rule template, sry.

Random
---
This is/was my first project using ANTLR4, Maven and the SonarSource API. The plugin is not good in any way, it is actually pretty terrible. But I still hope someone can work with it.

I might just be an idiot, but I found almost no useful information for creating a SonarQube plugin or working with SSLR.
