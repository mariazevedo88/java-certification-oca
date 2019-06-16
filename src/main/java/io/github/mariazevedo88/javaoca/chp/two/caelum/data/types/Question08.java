package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 05/05/2019
 * 
 * Question 1.2.8 (page 63) - Choose the appropriate option when attempting to 
 * compile and run the following file:
 * 
 * public static void main(String[] args) {
 *	  for(char c='a'; c<='z'; c++) {
 *      System.out.println(c);
 *	  }
 * }
 * 
 * a) Does not compile: we can not add one in a character. 
 * b) Does not compile: we can not compare characters with <. 
 * c) Compiles and prints the alphabet between a and z, inclusive. (x)
 */
public class Question08 {

	public static void main(String[] args) {
		for(char c='a'; c<='z'; c++) {
			System.out.println(c);
		}
	}

}
