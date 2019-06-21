package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.27 (page 95) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question27 {
 *	  public static void main(String[] args) {
 *		 String empty = null;
 *		 String full = "Welcome " + empty; 
 *       System.out.println(full);
 *	  }
 * }
 * 
 * a) Doesn't compile, because empty is null.
 * b) Doesn't compile for another reason.
 * c) Compile and print "Welcome ".
 * d) Compile and print "Welcome empty".
 * e) Compiles and prints another result that wasn't mentioned in these alternatives. (x)
 */
class Question27 {
	public static void main(String[] args) {
		String empty = null;
		String full = "Welcome " + empty;
		System.out.println(full);
	}
}
