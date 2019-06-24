package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.8 (page 120)
 * 
 * class Test {
 *    public static void main(String[] args) {
 *		 byte b = 1;
 *		 int i = 1;
 *		 long l = 1;
 *		 //float f = 1.0;
 *	  }
 * }
 * 
 * The code:
 * 
 * a) It doesn't compile line 3, since 1 is int and cannot be put in a byte.
 * b) It doesn't compile line 4, since 1 is long and cannot be put in a int.
 * c) It doesn't compile line 5, since 1 is int and cannot be put in a long.
 * d) It doesn't compile line 6, since 1.0 is double and cannot be put in a float. (x)
 * e) All lines compile.
 */
class Question08 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b = 1;
		int i = 1;
		long l = 1;
		//float f = 1.0;
	}
}
