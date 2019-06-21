package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.21 (page 84) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * public class Question21 {
 *	  public static void main(String[] args) {
 *		  StringBuilder sb = new StringBuilder();
 *        sb.append("guilherme").delete(2,3);
 *        System.out.println(sb);
 *	  }
 * }
 * 
 * a) The code doesn't compile: error in the line that tries to print the StringBuilder.
 * b) The code compiles and prints glherme.
 * c) The code compiles and prints guherme.
 * d) The code compiles and prints gilherme.
 * e) The code compiles and prints gulherme. (x)
 */
public class Question21 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("guilherme").delete(2,3);
		System.out.println(sb);
	}
}
