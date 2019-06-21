package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 20/06/2019
 * 
 * Question 1.2.36 (page 99) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question36 {
 *	  public static void main(String[] args) {
 *		 String s = "guilherme";
 *       s.substring(0, 2) = "gua";
 *       System.out.println(s);
 *	  }
 * }
 * 
 * a) Compilation error. (x) 
 * b) Compiles and prints "guilherme".
 * c) Compiles and prints "gualherme".
 */
class Question36 {
	public static void main(String[] args) {
		String s = "guilherme";
		//s.substring(0, 2) = "gua";
		System.out.println(s);
	}
}
