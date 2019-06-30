package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.28 (page 145) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class B {
 *	  final boolean valor = false;
 * }
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 B b = new B();
 *		 if(b.valor = true) {
 *			System.out.println("uhu true");
 *		 }
 *	  }
 * }
 * 
 * a) Doesn't compile. (x) 
 * b) Compiles and prints uhu true. 
 * c) Compiles and prints nothing. 
 */
class H {
	final boolean valor = false;
}

class Question28 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		H b = new H();
		//if(b.valor = true) {
			System.out.println("uhu true");
		//}
	}
}
