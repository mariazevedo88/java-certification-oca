package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.13 (page 123) - Considering the same code as the previous question, 
 * and if we switch to post-increment within the if?
 *
 * public class Test {
 *	  public static void main(String[] args) {
 *		 int i;
 *		 for(i = 0; i < 5; i++) {
 *			if(i++ % 3 == 0) {
 *				break;
 *			}
 *		 }
 *		 System.out.println(i);
 *	  }
 * }
 * 
 * What is the result?
 * 
 * a) Print 1. (x)
 * b) Print 2.
 * c) Print 3. 
 * d) Print 4.
 */
public class Question13 {
	public static void main(String[] args) {
		int i;
		for(i = 0; i < 5; i++) {
			if(i++ % 3 == 0) {
				break;
			}
		}
		System.out.println(i);
	}
}
