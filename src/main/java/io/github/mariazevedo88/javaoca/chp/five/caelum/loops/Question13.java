package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.13 (page 201) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 int i = 0;
 *       do; while(i++<10);
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and enters an infinite loop.
 * c) Compile and exit. (x)
 */
class Question13 {
	public static void main(String[] args) {
		int i = 0;
		do; while(i++<10);
	}
}
