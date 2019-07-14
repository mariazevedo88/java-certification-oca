package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.8 (page 169) - Which of the following are valid declarations and initializations for an array? 
 * 
 * a) int[] array = new int[10]; (x)
 * b) int array[] = new int[10]; (x)
 * c) int[] array = new int[];
 * d) int array[] = new int[];
 * e) int[] array = new int[2]{1,2};
 * f) int[] array = new int[]{1,2}; (x)
 * g) int[] array = int[10];
 * h) int[] array = new int[1,2,3];
 * i) int array[] = new int[1,2,3];
 * j) int array[] = {1,2,3}; (x)
 */
public class Question08 {
	public static void main(String[] args) {
		int[] array1 = new int[10];
		System.out.println(array1);
		int array2[] = new int[10];
		System.out.println(array2);
		//int[] array3 = new int[];
		//int array4[] = new int[];
		//int[] array5 = new int[2]{1,2};
		int[] array6 = new int[]{1,2};
		System.out.println(array6);
		//int[] array7 = int[10];
		//int[] array8 = new int[1,2,3];
		//int array9[] = new int[1,2,3];
		int array10[] = {1,2,3};
		System.out.println(array10);
	}
}
