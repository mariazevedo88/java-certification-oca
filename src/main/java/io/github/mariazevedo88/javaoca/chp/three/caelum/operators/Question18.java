package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.18 (page 125) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		String result = "results: " + 15 / 0.0;
 *		System.out.println(result);
 *	 }
 * }
 * 
 * a) Doesn't compile.
 * b) Compile and give an exception. 
 * c) Compiles and prints a positive infinity. (x)
 * d) Compiles and prints 0.
 */
class Question18 {
	public static void main(String[] args) {
		String result = "results: " + 15 / 0.0;
		System.out.println(result);
	}
}
