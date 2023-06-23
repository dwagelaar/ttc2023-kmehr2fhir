This is the implemented forward transformation. 

Compile as 

javac kmehr/Controller.java

javac kmehr/GUI.java

Run as 

java kmehr/GUI

The "load XML model" option loads in.xmi (XML format input model such as inKMEHR1.xmi). 

"main module" option runs the transformation.

"save model" option saves the output model in out.txt

Note that for  the largest model (size 1000) the stack size needs to be enlarged: 

java -Xss8m kmehr/GUI
