package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.26 (page 138) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class B extends C {}
 * 
 * class C {
 *	  int x;
 *	  public boolean equals(C c) {
 *		 return c.x==x;
 *	  }
 * }
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 C a = new C();
 *       C b = new B();
 *       a.x = 1;
 *       b.x = 1;
 *       System.out.println(a==b);
 *       System.out.println(a.equals(b));
 *	  }
 * }
 * 
 * a) Doesn't compile. (x)
 * b) Compiles and prints true, false. 
 * c) Compiles and prints true, true. 
 * d) Compiles and prints false, false. 
 * e) Compiles and prints false, true.
 */
class E extends F {}

class G {
	int x;
}

class F {
	int x;
	//public boolean equals(Object c) {
		//return c.x==x;
	//}
}
class Question26 {
	public static void main(String[] args) {
		F a = new F();
		//C b = new D();
		a.x = 1;
//		b.x = 1;
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
	}
}
