package io.github.mariazevedo88.javaoca.chp.six.caelum.methods;

/**
 * @author Mariana Azevedo
 * @since 13/10/2019
 * 
 * Question 1.6.6 (page 229) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		x();
 *	  }
 *	  static void x() {
 *		System.out.println("x");
 *		y();
 *	  }
 *	  static void y() {
 *		System.out.println("y");
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Print x, y. (x)
 * c) Print y, x.
 * d) Print x.
 * e) Print y.
 */
class Question06 {
	public static void main(String[] args) {
		x();
	}
	static void x() {
		System.out.println("x");
		y();
	}
	static void y() {
		System.out.println("y");
	}
}
