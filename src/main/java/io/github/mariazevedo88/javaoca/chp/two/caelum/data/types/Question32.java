package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 20/06/2019
 * 
 * Question 1.2.32 (page 97) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question32 {
 *	  public static void main(String[] args) {
 *		 String s = "estudando para a certificação";
 *       System.out.println(s.substring(3, 6)); 
 *	  }
 * }
 * 
 * a) Doesn't compile: character with accent and cedilla inside a String.
 * b) Doesn't compile: substring is subString.
 * c) Compiles and prints "uda". (x)
 * d) Compiles and prints "tuda".
 * e) Compiles and prints "tud".
 */
class Question32 {
	public static void main(String[] args) {
		String s = "estudando para a certificação";
		System.out.println(s.substring(3, 6));
	}
}
