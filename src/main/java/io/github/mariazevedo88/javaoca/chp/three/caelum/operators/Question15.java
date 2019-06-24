package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.15 (page 124) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		char c = 65;
 *		char c2 = -3;
 *		System.out.println(c + c2);
 *	 }
 * }
 * 
 * a) Doesn't compile in the two char statements.
 * b) Doesn't compile on the three lines inside the main method.
 * c) Doesn't compile only in the c2 declaration. (x)
 * d) Doesn't compile only in the sum of characters.
 * e) Compiles and run, printing 62.
 * f) Compiles and run, printing another value.
 */
class Question15 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char c = 65;
		//char c2 = -3;
		//System.out.println(c + c2);
	}
}
