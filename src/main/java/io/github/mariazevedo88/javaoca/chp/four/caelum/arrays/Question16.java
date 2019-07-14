package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.16 (page 182) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		ArrayList<String> list = new ArrayList<>();
 *		list.add("a"); list.add("b");
 *		list.add("a"); list.add("c");
 *		list.add("a"); list.add("b");
 *		list.add("a");
 *		System.out.println(list.lastIndexOf("b"));
 *	  }
 * }
 * 
 * a) Doesn't compile.  
 * b) Compiles and prints -1. 
 * c) Compiles and prints 0.
 * d) Compiles and prints 1.
 * e) Compiles and prints 2.
 * f) Compiles and prints 3.
 * g) Compiles and prints 4.
 * h) Compiles and prints 5. (x)
 * i) Compiles and prints 6.
 * j) Compiles and prints 7.
 */
class Question16 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a"); list.add("b");
		list.add("a"); list.add("c");
		list.add("a"); list.add("b");
		list.add("a");
		System.out.println(list.lastIndexOf("b"));
	}
}
