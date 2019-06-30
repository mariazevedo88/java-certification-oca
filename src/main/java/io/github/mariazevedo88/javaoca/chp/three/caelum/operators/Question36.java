package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.36 (page 155) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 switch(10) {
 *			case < 10:
 *				System.out.println("<");
 *			default:
 *				System.out.println("=");
 *			case > 10:
 *				System.out.println(">");
 *		 }
 *	  }
 * }
 * 
 * a) Compile error. (x)
 * b) Compile and print "=".
 * c) Compiles and prints "=" and ">".
 */
class Question36 {
	public static void main(String[] args) {
		//switch(10) {
			//case < 10:
				System.out.println("<");
			//default:
				System.out.println("=");
			//case > 10:
				System.out.println(">");
		//}
	}
}
