package chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 31/03/2019
 * 
 * Question 1.2.1 (page 59) - Choose the appropriate option when attempting to compile 
 * and run the following code:
 * 
 * public static void main(String[] args) {
 *	int
 *	age
 *	= 100;
 *	System.out.println(age);
 * }
 * 
 * a) The code doesn't compile: errors from the line that define a variable of type int.
 * b) The code doesn't compile: the variable age wasn't initialized, but was used in System.out.println.
 * c) The code compiles and prints 0.
 * d) The code compiles and prints 100. (x)
 * 
 */
public class Question01 {
	public static void main(String[] args) {
		int
		age
		= 100;
		System.out.println(age);
	}
}