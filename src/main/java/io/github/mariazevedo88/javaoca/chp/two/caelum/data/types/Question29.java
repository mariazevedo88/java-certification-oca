package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 20/06/2019
 * 
 * Question 1.2.29 (page 96) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question29 {
 *	  public static void main(String[] args) {
 *		 String empty = null;
 *		 String full = "Welcome " + empty; 
 *       System.out.println(full);
 *	  }
 * }
 * 
 * a) Doesn't compile, because empty is null.
 * b) Doesn't compile for another reason. (x)
 * c) Compile and print "Welcome ".
 * d) Compile and print "Welcome empty".
 * e) Compiles and prints another result that wasn't mentioned in these alternatives.
 */
class Question29 {
	String empty;
	public static void main(String[] args) {
		//String full = "Welcome " + empty;
		//System.out.println(full);
	}
}
