package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.2 (page 189) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		boolean run = true;
 *		while(run) {
 *			System.out.println(run);
 *		}
 *		System.out.println("finish");
 *	 }
 * }
 * 
 * a) Turning the variable to final causes the code to compile. 
 * b) Placing a line inside the loop that makes run = false causes the code to compile.
 * c) The code compiles and runs in infinite loop. (x)
 * d) The code compiles and runs, after a few passes through the loop it 
 * prints an exception and stops.
 */
class Question02 {
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println(run);
		}
		System.out.println("finish");
	}	
}
