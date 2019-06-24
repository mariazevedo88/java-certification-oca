package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.2 (page 116) - Make accounts with different operands:
 * 
 * int i1 = 3/2;
 * double i2 = 3/2;
 * double i3 = 3/2.0;
 * 
 * long x = 0; double d = 0;
 * double zero = x + d;
 * System.out.println(i1 + i2 + i3 + x + d + zero);
 * 
 * What is the result?
 * 
 * a) 3
 * b) 3.5 (x)
 * c) 4
 * d) 4.5
 */
class Question02 {
	public static void main(String[] args) {
		int i1 = 3/2;
	    double i2 = 3/2;
		double i3 = 3/2.0;
		 
		long x = 0; double d = 0;
		double zero = x + d;
		System.out.println(i1 + i2 + i3 + x + d + zero);
	}
}
