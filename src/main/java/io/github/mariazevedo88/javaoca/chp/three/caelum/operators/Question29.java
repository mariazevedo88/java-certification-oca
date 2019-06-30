package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.29 (page 145) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 int qt = 15;
 *		 if(qt=15) {
 *			System.out.println("yes");
 *		 }else {
 *			System.out.println("no");
 *		 }
 *	  }
 * }
 * 
 * a) Doesn't compile. (x) 
 * b) Prints yes. 
 * c) Prints no. 
 */
class Question29 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int qt = 15;
		//if(qt=15) {
			System.out.println("yes");
		//}else {
			System.out.println("no");
		//}
	}
}
