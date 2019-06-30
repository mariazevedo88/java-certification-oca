package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.27 (page 144) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		if(args.length > 0) 
 *			System.out.println("1 or more");
 *		else
 *			System.out.println("0");
 *	 }
 * }
 * 
 * a) Doesn't compile: length is method. 
 * b) Doesn't compile: missing keys in if and else. 
 * c) If you call without arguments, print 0. (x)
 * d) Will not print 0. 
 */
class Question27 {
	public static void main(String[] args) {
		if(args.length > 0) 
			System.out.println("1 or more");
		else
			System.out.println("0");
	}
}
