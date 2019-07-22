package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.9 (page 198) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		  boolean i = false;
 *		  do {
 *			 System.out.println(i);
 *        } while(i);
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compile and print false. (x)
 * c) Compiles and prints nothing.
 */
class Question09 {
	public static void main(String[] args) {
		boolean i = false;
		do {
			System.out.println(i);
		} while(i);
	}
}
