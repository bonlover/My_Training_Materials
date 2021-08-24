//This is the package in which our .java file exists.

/*
* Multi Line Comment
* This package declaration is needed for java to compile and run(it needs to know where to find information/
* logic/code about the HelloWorld Class)
*
* */
package dev.gurung.hello;
/**
 * This is java doc comment - these will show up when document is generated from source code
 *
 * */

public class HelloWorld {
    /*
    * Since Java 6, all java programs( that are not run inside a container like Web Servlet Container) start
    * and end with the main method.
    *
    * The class containing the main method can any name, but the method itself must always be named 'main'
    *
    * public: is a Java Access Modifier - it means this main method can be accessed anywhere
    * within the program's execution.
    *
    * static: is Java keyword that means the method can be invoked/called/used without creating an instance
    * of the class first(making it a global method)
    *
    * void: is a Java return type keyword that means this method does not return any values of any data type
    *
    * String[] args => 'args' is a variable that represents any arguments passed to the method String[]
    * 'String array' means this method can take any number of arguments as an array of Strings
    *
    * */
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        System.out.println("Num Args:" +args.length);

    }
}
