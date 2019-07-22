package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.1 (page 188) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		int a = 10;
 *		while(a>100) a++;
 *		System.out.println(a);
 *	  }
 * }
 * 
 * a) Doesn't compile because it never enters the loop. 
 * b) Compiles and prints 99.
 * c) Compiles and prints 100.
 * d) Compiles and prints 101.
 * e) Compiles and prints another value. (x)
 */
class Question01 {
	public static void main(String[] args) {
		int a = 10;
		while(a>100) a++;
		System.out.println(a);
	}
}
