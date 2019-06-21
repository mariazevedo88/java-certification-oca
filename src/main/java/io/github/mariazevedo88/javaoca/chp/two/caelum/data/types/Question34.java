package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 20/06/2019
 * 
 * Question 1.2.34 (page 98) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question34 {
 *	  public static void main(String[] args) {
 *		 int val = 10;
 *       int div = 4;
 *       double res = val/div;
 *       System.out.println(val + div + "...");
 *       System.out.println(res + " = result");
 *	  }
 * }
 * 
 * a) Prints the numbers 10, 4 and 2.5. 
 * b) Prints the numbers 14 and 2.5.
 * c) None of the other alternatives. (x)
 */
class Question34 {
	public static void main(String[] args) {
		int val = 10;
		int div = 4;
		double res = val/div;
		System.out.println(val + div + "...");
		System.out.println(res + " = result");
	}
}
