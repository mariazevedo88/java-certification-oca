package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 01/06/2019
 * 
 * Question 1.2.13 (page 70) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class B {
 *	 int c;
 *	 void c(int c) {
 *		c = c;
 *	 }
 * }
 *
 * class Question13 {
 *	 public static void main(String[] args) {
 *		B b = new B();
 *		b.c = 10;
 *		System.out.println(b.c); // prints 10
 *		b.c(30);
 *		System.out.println(b.c); // prints 10
 *	 }
 * }
 * 
 * a) Doesn't compile: member variable name and method conflict in B.
 * b) Doesn't compile: member variable name and local variable conflict in B.
 * c) Compiles and rotates, printing 10 and 30.
 * d) Compiles and rotates, printing another result. (x)
 */
class C {
	int c;
	void c(int c) {
		c = c;
	}
}

class Question13 {
	public static void main(String[] args) {
		C b = new C();
		b.c = 10;
		System.out.println(b.c); // prints 10
		b.c(30);
		System.out.println(b.c); // prints 10
	}
}
