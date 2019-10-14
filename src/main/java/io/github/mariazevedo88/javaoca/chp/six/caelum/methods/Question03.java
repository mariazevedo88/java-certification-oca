package io.github.mariazevedo88.javaoca.chp.six.caelum.methods;

/**
 * @author Mariana Azevedo
 * @since 20/09/2019
 * 
 * Question 1.6.3 (page 223) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		System.out.println(a(args.length));
 *	  }
 *	  static int a(int l){
 *		if(l<10) return b(1);
 *		else return c();
 *	  }
 *	  static int b(int l) {
 *		if(l<10) return b(1);
 *		else return c();
 *	  }
 *	  static long c() {
 *		return 3;
 *	  }
 * }
 * 
 * a) Doesn't compile: error calling method b. 
 * b) Doesn't compile: error calling method c. (x)
 * c) Doesn't compile for an unlisted reason.
 * d) Compiles and, when calling with 15 arguments, prints 3.
 * e) Compiles and, when calling with 15 arguments, goes into infinite loop.
 */
class Question03 {
	public static void main(String[] args) {
		System.out.println(a(args.length));
	}
	static int a(int l){
		if(l<10) return b(1);
		else return c();
	}
	static int b(int l) {
		if(l<10) return b(1);
		else return c();
	}
//	static long c() {
//		return 3;
//	}
	static int c() {
		return 3;
	}
}
