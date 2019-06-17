package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 16/06/2019
 * 
 * Question 1.2.17 (page 79) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class G {
 *	 void x() {
 *		System.out.println("empty");
 *	 }
 *	 void x(String... args) {
 *		System.out.println(args.length);
 *	 }
 * }
 * 
 * class H {
 *	 void x(String... args) {
 *		System.out.println(args.length);
 *	 }
 *	 void x() {
 *		System.out.println("empty");
 *	 }
 * }
 *
 * class Question17 {
 *	 public static void main(String[] args) {
 *		new G().x();
 *		new H().x();
 *	 }
 * }
 * 
 * a) Doesn't compile: method conflict with varargs and no arguments.
 * b) Compiles and prints empty/empty. (x)
 * c) Compiles and prints empty/0.
 * d) Compiles and prints 0/empty.
 * e) Compiles and prints 0/0.
 */
class G {
	void x() {
		System.out.println("empty");
	}
	void x(String... args) {
		System.out.println(args.length);
	}
}

class H {
	void x(String... args) {
		System.out.println(args.length);
	}
	void x() {
		System.out.println("empty");
	}
}

class Question17 {
	public static void main(String[] args) {
		new G().x();
		new H().x();
	}
}
