package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 20/06/2019
 * 
 * Question 1.2.35 (page 99) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class Question35 {
 *	  public static void main(String[] args) {
 *		 String s = "estudando para a certificação";
 *       s.replace("e", "a");
 *       System.out.println(s);
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and prints "estudando para a certificação". (x)
 * c) Compiles and prints "astudando para a cartificação".
 * d) Compiles and prints "studando para a crtificação".
 */
class Question35 {
	public static void main(String[] args) {
		String s = "estudando para a certificação";
		s.replace("e", "a");
		System.out.println(s);
	}
}
