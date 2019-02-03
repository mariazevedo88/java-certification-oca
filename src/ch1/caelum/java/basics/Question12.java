package ch1.caelum.java.basics;

import model.basic.Client;
//import model.advanced.Client;

/**
 * @author Mariana Azevedo
 * @since 02/02/2019
 * 
 * Question 1.4.2 (page 39) - Choose the appropriate option to save and compile the following file:
 * 
 * import model.basic.Client;
 * import model.advanced.Client;
 * 
 * class Test {
 * 	  public static void main(String[] args) {
 *		 System.out.println("Welcome!");
 *	  }
 * }
 * 
 * In model/basic/Client.java file:
 * 
 * public class Client {}
 * 
 * In model/advanced/Client.java file:
 * 
 * public class Client {}
 * 
 * a) The code from the first file does not compile, error when trying to import two classes with the same name (x)
 * b) The code from the third file does not compile, error when trying to define a class with the name of a class that already exists
 * c) The whole code compiles, but when running it gives error by having imported two classes with the same name
 * d) The whole code compiles and rotates by printing Welcome!. Since none of the imported classes is used in the code, there is no ambiguity
 * 
 */
public class Question12 {

	public static void main(String[] args) {
		System.out.println("Welcome!");
	}
}
