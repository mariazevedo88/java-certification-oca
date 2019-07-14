package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.9 (page 172) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * class A {
 *	 public static void main(String[] args) {
 *		int zyx[][]=new int[3];
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
 * a) Doesn't compile, error declaring zyx. (x)
 * b) Compile and give error when trying to assign the second array to zyx.
 * c) Compile and give error when trying to print array size.
 * d) Compiles and prints 10.
 * e) Compiles and prints 20.
 * f) Compiles and prints 30.
 */
class Question09 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//int zyx[][]=new int[3];
		int[]x=new int[20];
		int[]y=new int[10];
		int[]z=new int[30];
		//zyx[0]=x;
		//zyx[1]=y;
		//zyx[2]=z;
		//System.out.println(zyx[2].length);
	}
}
