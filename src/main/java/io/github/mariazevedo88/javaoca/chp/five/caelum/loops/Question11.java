package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.11 (page 200) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 int i = 0;
 *       do System.out.println(i); while(i++>10);
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and prints nothing. 
 * c) Compiles and prints 0. (x)
 * d) Compiles and prints from 0 to 9.
 * e) Compiles and prints from 0 to 10.
 * f) Compiles and prints nothing. (duplicated option)
 */
class Question11 {
	public static void main(String[] args) {
		int i = 0;
		do System.out.println(i); while(i++>10);
	}
}
