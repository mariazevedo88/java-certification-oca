package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.5 (page 167) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		int x[] = new int[3];
 *		for(x[1]=x.length-1;x[0]==0;x[1]--) {
 *			x[x[1]]=-5;
 *			System.out.println(x[1]);
 *      }
 *	  } 
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles, prints some numbers and gives an exception. (x)
 * c) Compiles and prints nothing.
 * d) Compile and print 2.
 * e) Compile and print -5.
 * f) Compile and print 2,-5.
 * g) Compile and print 2,-5,-5.
 * h) Compile and print 2,1,-5.
 * i) Compile and print -5,-5.
 * j) Gives an exception.
 */
class Question05 {
	public static void main(String[] args) {
		int x[] = new int[3];
		for(x[1]=x.length-1;x[0]==0;x[1]--) {
			x[x[1]]=-5;
			System.out.println(x[1]);
		}
	}
}
