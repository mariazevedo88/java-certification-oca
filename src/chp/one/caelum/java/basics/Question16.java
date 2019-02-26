package chp.one.caelum.java.basics;

import org.apache.log4j.Logger;

/**
 * @author Mariana Azevedo
 * @since 25/02/2019
 * 
 * Question 1.4.6 (page 43) - Choose the appropriate option to save and compile the following file:
 * 
 * package A;
 * 
 * class B {
 *
 *	  public static void main(String[] a) {
 *		  System.out.println("running");
 *	  }
 * }
 * 
 * a) Doesn't compile: the variable on the main method should be called args.
 * b) Don't compile: package with uppercase letter.
 * c) Compiles, but doesn't spin: class B is not public.
 * d) Compile and run (x)
 *
 */
public class Question16 {

	private static final Logger logger = Logger.getLogger(Question16.class.getName());
	
	public static void main(String[] a) {
		logger.info("running");
	}

}
