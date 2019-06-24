package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.6 (page 119) - Print the division by 0 of floating-point numbers
 *
 * System.out.println(3/0);
 * System.out.println(3/0.0);
 * System.out.println(3.0/0);
 * System.out.println(-3.0/0);
 * 
 * What are the results?
 * 
 * R: Exception in thread "main" java.lang.ArithmeticException: / by zero (line: 20);
 *    Infinity (line: 21)
 *    Infinity (line: 22)
 *    -Infinity (line: 23)
 */
class Question06 {
	public static void main(String[] args) {
		System.out.println(3/0);
		System.out.println(3/0.0);
		System.out.println(3.0/0);
		System.out.println(-3.0/0);
	}
}
