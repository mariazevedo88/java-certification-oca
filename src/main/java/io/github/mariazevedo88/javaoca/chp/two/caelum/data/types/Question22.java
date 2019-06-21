package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.22 (page 85) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * public class Question22 {
 *	  public static void main(String[] args) {
 *		 StringBuilder sb = new StringBuilder("guilherme");
 *		 System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
 *		 System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
 *	  }
 * }
 * 
 * a) The code prints 13 and -2. (x)
 * b) The code prints 13 and 0.
 * c) The code prints 13 and -1.
 * d) The code prints 13 and 8.
 * e) The code prints 13 and 10.
 * f) The code prints 15 and -2.
 * g) The code prints 15 and 0.
 * h) The code prints 15 and -1.
 * i) The code prints 15 and 8.
 * j) The code prints 15 and 10. 
 */
public class Question22 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("guilherme");
		System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
		System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
	}
}
