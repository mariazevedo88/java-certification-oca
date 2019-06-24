package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.11 (page 122) - What happens to the following code? Compile? Runs?
 * 
 * public class Test {
 * 	  public static void main(String[] args) {
 *		byte b1 = 127;
 *		byte b2 = -128;
 *		byte b3 = b1 + b2;
 *		System.out.println(b3);
 *    }
 * }
 * 
 * a) Doesn't compile for an error on line 3.
 * b) Doesn't compile for an error on line 4.
 * c) Doesn't compile for an error on line 5. (x)
 * d) Compile and print -1.
 */
public class Question11 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b1 = 127;
		byte b2 = -128;
		//byte b3 = b1 + b2;
		//System.out.println(b3);
	}
}
