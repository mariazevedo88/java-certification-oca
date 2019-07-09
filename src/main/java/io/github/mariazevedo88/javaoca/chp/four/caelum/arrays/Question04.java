package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 09/07/2019
 * 
 * Question 1.4.4 (page 167) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		int x[] = new int[3];
 *		for(int i=x.length;i>=0;i--) x[i]=i*2;
 *		System.out.println("end!");
 *	 }
 * }
 * 
 * a) The program doesn't compile. 
 * b) The program prints end!. 
 * c) The program compiles and gives execution error. (x)
 */
class Question04 {
	public static void main(String[] args) {
		int x[] = new int[3];
		for(int i=x.length;i>=0;i--) x[i]=i*2;
		System.out.println("end!");
	}
}
