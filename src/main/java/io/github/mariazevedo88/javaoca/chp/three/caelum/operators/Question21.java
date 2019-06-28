package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 27/06/2019
 * 
 * Question 1.3.21 (page 127) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		System.out.println(((!(true==false))==true ? 1 : 0)==0);
 *	 }
 * }
 * 
 * a) Print true. 
 * b) Print false. (x)
 * c) Doesn't compile.
 * d) Print 1.
 * e) Print 0. 
 */
public class Question21 {
	public static void main(String[] args) {
		System.out.println(((!(true==false))==true ? 1 : 0)==0);
	}
}
