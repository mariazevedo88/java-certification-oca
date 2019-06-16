package io.github.mariazevedo88.javaoca.chp.one.caelum.java.basics;

import org.apache.log4j.Logger;

import io.github.mariazevedo88.javaoca.model.basic.Client;
//import model.basic.Client;

/**
 * @author Mariana Azevedo
 * @since 25/02/2019
 * 
 * Question 1.4.4 (page 41) - Choose the appropriate option to save and compile the following file:
 * 
 * import model.basic.Client;
 * import model.basic.Client;
 * 
 * public class Test {
 *
 *	  public static void main(String[] args) {
 *		  System.out.println("Welcome " + new Client().name);
 *	  }
 * }
 * 
 * In model/basic/Client.java file:
 * 
 * public class Client {
 * 	  public String name="guilherme";
 * }
 * 
 * a) The code from the first file doesn't compile, error when trying to import two classes with the same name.
 * b) The code compiles, but when running, it gives error because it imported two classes with the same name.
 * c) The code compiles and prints "Welcome guilherme", since there is no ambiguity (x)
 *
 */
public class Question14 {
	
	private static final Logger logger = Logger.getLogger(Question14.class.getName());

	public static void main(String[] args) {
		logger.info("Welcome " + new Client().name);
	}

}
