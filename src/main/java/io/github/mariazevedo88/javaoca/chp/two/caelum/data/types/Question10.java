package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 05/05/2019
 * 
 * Question 1.2.10 (page 64) - Choose the appropriate option when attempting to 
 * compile and run the following file:
 * 
 * public static void main(String[] args) {
 *	  boolean BOOLEAN = false;
 *    if(BOOLEAN) {
 *    	 System.out.println("Yes");
 *	  }
 * }
 * 
 * a) Does not compile: we can not declare a variable with the name of a reserved word. 
 * b) Does not compile: we can not declare a variable starting with uppercase letters. 
 * c) Compiles and rotates, printing Yes.
 * d) Compiles and rotates, not printing anything. (x)
 */
public class Question10 {

	public static void main(String[] args) {
		boolean BOOLEAN = false;
		if(BOOLEAN) {
			System.out.println("Yes");
		}
	}

}
