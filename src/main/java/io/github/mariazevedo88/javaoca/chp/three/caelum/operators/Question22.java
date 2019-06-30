package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.22 (page 135) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		String s1 = "s1";
 *      String s2 = "s" + "1";
 *      System.out.println(s1==s2);
 *      System.out.println(s1==("" + s2));
 *	 }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and prints true, false. (x)
 * c) Compiles and prints true, true.
 * d) Compiles and prints false, false.
 * e) Compiles and prints false, true. 
 */
class Question22 {
	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = "s" + "1";
		System.out.println(s1==s2);
		System.out.println(s1==("" + s2));
	}
}
