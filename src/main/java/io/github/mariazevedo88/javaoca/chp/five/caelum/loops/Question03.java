package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.3 (page 195) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		for(;;) {
 *			System.out.println("a");
 *		}
 *		System.out.println("b");
 *	 }
 * }
 * 
 * a) Doesn't compile. (x)
 * b) Compiles and prints "a" infinitely.
 * c) Compiles and prints "b".
 * d) Compiles and prints a, then b, then stops.
 * e) Compiles and prints several times and then throws a StackOverflowError.
 */
class Question03 {
	public static void main(String[] args) {
		for(;;) {
			System.out.println("a");
		}
		//System.out.println("b");
	}
}
