package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.8 (page 197) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		  for(int i=0; i<2; i++, System.out.println(i)) {
 *			 System.out.println(i);
 *        }
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and prints 0 1 2.
 * c) Compiles and prints 0 0 1 1 2 2.
 * d) Compiles and prints 0 1 1 2 2.
 * e) Compiles and prints 0 1 1 2. (x)
 */
class Question08 {
	public static void main(String[] args) {
		for(int i=0; i<2; i++, System.out.println(i)) {
			System.out.println(i);
		}
	}
}
