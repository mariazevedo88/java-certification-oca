package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 05/05/2019
 * 
 * Question 1.2.5 (page 62) - Choose the appropriate option when attempting to 
 * compile and run the following file:
 * 
 * public static void main(String[] args) {
 *		boolean array = new boolean[300];
 *		System.out.println(array[3]);
 * }
 * 
 * a) Prints true.
 * b) Prints false. (x)
 * c) Prints 0.
 * d) Prints -1.
 * e) Prints null.
 * f) Does not compile.
 */
public class Question05 {

	public static void main(String[] args) {
		boolean[] array = new boolean[300];
		System.out.println(array[3]);
	}

}
