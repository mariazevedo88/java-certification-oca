package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.11 (page 173) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		int zyx[][]=new int[3][10];
 *		int[]x=new int[20];
 *		int[]y=new int[10];
 *		int[]z=new int[30];
 *		zyx[0]=x;
 *		zyx[1]=y;
 *		zyx[2]=z;
 *		System.out.println(zyx[2].length);
 *	 }
 * }
 * 
 * a) Doesn't compile, error declaring zyx.
 * b) Doesn't compile, error when assigning arrays of size other than 10 in zyx.
 * c) Compile and give error when trying to assign the second array to zyx.
 * d) Compile and give error when trying to print array size.
 * e) Compiles and prints 10.
 * f) Compiles and prints 20.
 * g) Compiles and prints 30. (x)
 */
class Question11 {
	public static void main(String[] args) {
		int zyx[][]=new int[3][10];
		int[]x=new int[20];
		int[]y=new int[10];
		int[]z=new int[30];
		zyx[0]=x;
		zyx[1]=y;
		zyx[2]=z;
		System.out.println(zyx[2].length);
	}
}
