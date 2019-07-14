package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.19 (page 184) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		 ArrayList<String> a = new ArrayList<String>();
 *		 a.add("a", 0); 
 *       a.add("b", 0);
 *		 a.add("c", 0);
 *		 a.add("d", 0);
 *		 System.out.println(a.get(0));
 *		 System.out.println(a.get(1));
 *       System.out.println(a.get(2));
 *       System.out.println(a.get(3));
 *	  }
 * }
 * 
 * a) Doesn't compile. (x) 
 * b) Compiles and prints abcd.
 * c) Compiles and prints dcba.
 * d) Compiles and prints adcb.
 * e) Compiles and prints bcda.
 */
class Question19 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		//a.add("a", 0); 
		//a.add("b", 0);
		//a.add("c", 0); 
		//a.add("d", 0);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
	}
}
