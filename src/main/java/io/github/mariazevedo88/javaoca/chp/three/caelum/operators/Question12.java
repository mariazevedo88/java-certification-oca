package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.12 (page 122) - What is the result of the following code?
 * 
 * public class Test {
 *	  public static void main(String[] args) {
 *		 int i;
 *		 for(i = 0; i < 5; i++) {
 *			if(++i % 3 == 0) {
 *				break;
 *			}
 *		 }
 *		 System.out.println(i);
 *	  }
 * }
 * 
 * a) Print 1.
 * b) Print 2.
 * c) Print 3. (x)
 * d) Print 4.
 */
public class Question12 {
	public static void main(String[] args) {
		int i;
		for(i = 0; i < 5; i++) {
			if(++i % 3 == 0) {
				break;
			}
		}
		System.out.println(i);
	}
}
