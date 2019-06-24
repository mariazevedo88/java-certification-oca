package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Santos
 * @since 23/06/2019
 * 
 * Question 1.3.7 (page 119) - What is the result of this code?
 *
 * class xyz {
 *	  public static void main(String[] args) {
 *		 int y;
 *		 for(int x=0; x<10; ++x) {
 *			y = x % 5 + 2;
 *		 }
 *		 System.out.println(y);
 *	  }
 * }
 * 
 * a) Compilation error on line 3 
 * b) Compilation error on line 7 (x)
 * c) 1
 * d) 2
 * e) 3
 * f) 4
 * g) 5
 * h) 6
 */
class Question07 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int y;
		for(int x=0; x<10; ++x) {
			y = x % 5 + 2;
		}
		//System.out.println(y);
	}
}
