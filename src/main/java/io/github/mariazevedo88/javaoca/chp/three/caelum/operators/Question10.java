package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.10 (page 121) - What happens to the following code? Compile? Runs?
 * 
 * public class Test {
 * 	  public static void main(String[] args) {
 *		byte b1 = 5;
 *		byte b2 = 3;
 *		byte b3 = b1 + b2;
 *    }
 * }
 * 
 * R: Don't compile (line: 23). Every arithmetic operation returns at least an int. 
 * The result of b1 + b2 is an int. We can do casting or declare b3 as int.
 */
public class Question10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b1 = 5;
		byte b2 = 3;
		//byte b3 = b1 + b2;
	}
}
