package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.23 (page 92) - Consider the following code inside a main:
 * 
 * class Question23 {
 *	  public static void main(String[] args) {
 *		 String s = "aba";
 *		 for(int i = 0; i< 9; i++) {
 *			s = s + "aba";
 *		 }
 *		 System.out.println(s.length);
 *	  }
 * }
 * 
 * a) Doesn't compile. (x)
 * b) Compile and print 3.
 * c) Compile and print 30.
 * d) Compile and print 33.
 * e) Compile and print 36.
 */
class Question23 {
	public static void main(String[] args) {
		String s = "aba";
		for(int i = 0; i< 9; i++) {
			s = s + "aba";
		}
		//System.out.println(s.length);
	}
}
