package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 20/06/2019
 * 
 * Question 1.2.31 (page 97) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question31 {
 *	  public static void main(String[] args) {
 *		 String s = null;
 *       String s2 = new String(s); 
 *       System.out.println(s2);
 *	  }
 * }
 * 
 * a) Doesn't compile when trying to invoke constructor.
 * b) Compiles and prints nothing. 
 * c) Compiles and print null.
 * d) Compiles and gives execution error when trying to create the second String. (x)
 */
class Question31 {
	public static void main(String[] args) {
		String s = null;
		String s2 = new String(s);
		System.out.println(s2);
	}
}
