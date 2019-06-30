package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.31 (page 146) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 String name = args[0];
 *		 if(name.equals("guilherme"))
 *		 	System.out.println(name);
 *		    System.out.println("good");
 *       else
 *       	System.out.println("better");
 *			System.out.println(name);
 *	  }
 * }
 * 
 * a) Compile error in if. 
 * b) Compile error in else. (x) 
 * c) Compile and print the name and "good" if the first argument is guilherme.
 * d) Compiles and gives execution error if no arguments are passed on the command line. 
 */
public class Question31 {
	public static void main(String[] args) {
		String name = args[0];
		if(name.equals("guilherme"))
			System.out.println(name);
		    System.out.println("good");
		//else
			System.out.println("better");
			System.out.println(name);
	}
}
