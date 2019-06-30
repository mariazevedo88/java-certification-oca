package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.33 (page 153) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 int t2 = 1;
 *       int t = args.length;
 *		 switch (t) {
 *			case t2:
 *				System.out.println("1");
 *				break;
 *			default:
 *				System.out.println("arg???");
 *		 }
 *	  }
 * }
 * 
 * a) Doesn't compile. (x)
 * b) When run without arguments throws an exception.
 * c) When running with two arguments, print only "2".
 * d) When running with 5 arguments, print "+++". 
 */
class Question33 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int t2 = 1;
		int t = args.length;
		switch (t) {
			//case t2:
			//	System.out.println("1");
			//	break;
			default:
				System.out.println("arg???");
		}
	}
}
