package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.14 (page 123) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 byte b1 = 100;
 *		 byte b2 = 131;
 *		 System.out.println(b1);
 *	  }
 * }
 * 
 * a) Compiles and prints a positive number.
 * b) Compiles and prints a negative number.
 * c) Compiles and gives a number overflow exception.
 * d) Compiles and prints a number that we cannot tell for sure.
 * e) Compiles and prints "Not a Number".
 * f) Doesn't compile. (x)
 */
class Question14 {
	public static void main(String[] args) {
		byte b1 = 100;
		//byte b2 = 131;
		System.out.println(b1);
	}
}
