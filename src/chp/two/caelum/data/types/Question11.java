package chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 01/06/2019
 * 
 * Question 1.2.11 (page 66) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * public class A {
 *	 public static void main(String[] args) {
 *		int x = 15;
 *		int y = x;
 *		y++;
 *		x++;
 *		int z = y;
 *		z--;
 *		System.out.println(x + y + z);
 *	 }
 * }
 * 
 * a) Prints 43.
 * b) Prints 44.
 * c) Prints 45.
 * d) Prints 46.
 * e) Prints 47. (x)
 * f) Prints 48.
 * g) Prints 49.
 */
public class Question11 {
	public static void main(String[] args) {
		int x = 15;
		int y = x;
		y++;
		x++;
		int z = y;
		z--;
		System.out.println(x + y + z);
	}
}
