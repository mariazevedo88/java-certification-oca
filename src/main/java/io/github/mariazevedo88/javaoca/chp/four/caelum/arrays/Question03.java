package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 09/07/2019
 * 
 * Question 1.4.3 (page 166) - Choose the appropriate option when attempting to compile 
 * and run the following file, in relation to the lines within the main method:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		int x[] = new int[0];
 *		int x[] = new int[] {0,3,5};
 *		int x[] = {0,3,5};
 *	 }
 * }
 * 
 * a) The first and second lines don't compile. 
 * b) The second and third lines don't compile. (x)
 * c) Only the third line doesn't compile.
 * d) The program compiles and runs, giving an exception.
 * e) The program compiles and runs, printing nothing.
 */
class Question03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x[] = new int[0];
		//int x[] = new int[] {0,3,5};
		//int x[] = {0,3,5};
	}
}
