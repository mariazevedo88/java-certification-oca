package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.32 (page 153) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 int t = args.length;
 *		 switch (t) {
 *		 	case 1:
 *		    	System.out.println("1");
 *       	case 2:
 *       		System.out.println("2");
 *			default:
 *				System.out.println("+++");
 *       }
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) When run without arguments throws an exception.
 * c) When running with two arguments, print only "2".
 * d) When running with 5 arguments, print "+++". (x)
 */
class Question32 {
	public static void main(String[] args) {
		int t = args.length;
		switch (t) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			default:
				System.out.println("+++");
		}
	}
}
