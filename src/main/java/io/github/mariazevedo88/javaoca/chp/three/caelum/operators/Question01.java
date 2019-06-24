package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.1 (page 116) - Which code does it compile?
 * 
 * a) short s = 10;
 *    char c = s;
 * b) char c = 10; (x)
 *	  long l = c;
 * c) char c = 10;
 *	  short s = c;
 */
class Question01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		short s = 10;
//		char c = s;
		
		char c = 10;
		long l = c;
//		System.out.println(l);
		
//		char c = 10;
//		short s = c;
	}
}
