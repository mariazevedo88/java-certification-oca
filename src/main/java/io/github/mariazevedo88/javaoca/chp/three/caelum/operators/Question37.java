package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.37 (page 155) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 switch(10) {
 *			case 10:
 *				System.out.println("a");
 *				break;
 *				System.out.println("b");
 *			default:
 *				System.out.println("c");
 *			case 11:
 *				System.out.println("d");
 *		}
 *	  }
 * }
 * 
 * a) Compile error. (x)
 * b) Prints a and b and c and d.
 * c) Prints a.
 */
class Question37 {
	public static void main(String[] args) {
		switch(10) {
			case 10:
				System.out.println("a");
				break;
				//System.out.println("b");
			default:
				System.out.println("c");
			case 11:
				System.out.println("d");
		}
	}
}
