
GDScript SonarQube Plugin
==========

A basic GDScript Plugin for SonarQube  10.x (started programming for 9.x)
Tested with GDScript 4, should be compatible with Godot 3, but I am currently not testing GDScript 3.

The plugin isn't nearly finished. It is terrible in many ways.

Godot 4 has added things for GDScript, when these are used, there might be issues with the interpreter.

**Make sure on disable the scanning of the addon folder** 
To disable scanning, the addon folder go to:
Administration - Configuration Analysis Scope
And add \**/addons/** to the exclusion. You also can do this for a single project, if you dont want that to happen for every project.

Rules
-----
Currently, there are 11 rules implemented:
<ol>  
<li>Avoid unnecessary parentheses</li>  
<li>Multiple statements in one line (BETA)</li>  
<li>Too many characters in one line</li>  
<li>Trailing comma in lists</li>
<li>Trailing comma in single-line lists</li>
<li>Use PascalCase for enum names</li>
<li>Use the English versions of the boolean operators</li>
<li>Use underscore on large numbers</li>
<li>void leading or trailing zero in floating-point numbers</li>
<li>Write constants with CONSTANT_CASE</li>
<li>Write hexadecimal numbers in lowercase</li>
<li>ClassNamePascalCase</li>
<li>FileNameSnakeCase</li>
<li>MethodSnakeCase</li>
</ol>

I will add/repair rules if requested.
Be aware, I only tested the rules on my own code, so there **WILL** be issues.

Plugin
--------

The Interpreter of this plugin is currently using ANTLR4, the interpreted is based on the [grammars-v4](https://github.com/antlr/grammars-v4) repository. The Parser and Lexer have been edited to suit the purpose of this plugin. But it was a very good start point, so thanks ❤


If you find some issues, like false-positives or false-negatives, you may report them here.
Necessary information:
 <ol>  
<li>What rule is being detected wrong</li>  
<li>The code or a screenshot of the code, you may change the variable names, they are usually not relevant</li>  
</ol>

### Installing the Plugin

To install the plugin, move the .jar file into the *extensions/plugin* folder.
When using docker, you might have to create a path to the extensions folder.

Todo
---------

### Rules:
Edit the severity of each rule accordantly, currently each rule is a *Code Smell* with the severity *Minor*.
You may change the severity, if you create your own quality profile.
If you want to change the type of the rule, you have to edit the code of the plugin/the type inside the json file from the rule.
Also if you want to change the approximation on how long it takes to fix a code smell/bug, you also have to edit the json of the rule. Check the "Adding Rules" segment on where to find the json file.

Many rules from the [Godot Styleguide](https://docs.godotengine.org/en/stable/tutorials/scripting/gdscript/gdscript_styleguide.html)  are not implemented yet. They have to be added.

### Coverage:
Currently I have no clue if this is possible. [gdUnit](https://mikeschulze.github.io/gdUnit3/) provides (as far as I know) no report about the code coverage.

### Metrics:
<ul>  
<li>No comments line of codes, probably the lexer/parser has to be edited, so comments get recognized</li>  
<li>Code duplication (no clue on how to get this running)</li> 
</ul>

### Unit tests:
Well, I have to look into that

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
This is/was my first project using ANTLR4, Maven and the SonarSource API.
