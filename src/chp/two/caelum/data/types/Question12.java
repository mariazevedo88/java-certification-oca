package chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 01/06/2019
 * 
 * Question 1.2.12 (page 67) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class B {
 *	 int v = 15;
 * }
 *
 * class Question12 {
 *	 public static void main(String[] args) {
 *		B x = new B();
 *		B y = x;
 *		y.v++;
 *		x.v++;
 *		B z = y;
 * 		z.v--;
 *		System.out.println(x.v + y.v + z.v);
 *	 }
 * }
 * 
 * a) Prints 43.
 * b) Prints 44.
 * c) Prints 45.
 * d) Prints 46.
 * e) Prints 47.
 * f) Prints 48. (x)
 * g) Prints 49.
 */
class B {
	int v = 15;
}

class Question12 {
	public static void main(String[] args) {
		B x = new B();
		B y = x;
		y.v++;
		x.v++;
		B z = y;
		z.v--;
		System.out.println(x.v + y.v + z.v);
	}
}
