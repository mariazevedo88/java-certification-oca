package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.18 (page 183) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		 ArrayList<String> a = new ArrayList<String>();
 *		 ArrayList<String> b = new ArrayList<String>();
 *       ArrayList<String> c = new ArrayList<String>();
 *		 b.add("a"); c.add("c");
 *		 b.add("b"); c.add("d");
 *		 a.addAll(b);
 *		 a.addAll(c);
 *		 System.out.println(a.get(0));
 *		 System.out.println(a.get(3));
 *	  }
 * }
 * 
 * a) Doesn't compile.  
 * b) Compiles and prints a and d. (x)
 * c) Compiles and prints c and b.
 * d) Compiles and we don't know the order in which the elements will be printed.
 */
class Question18 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		b.add("a"); c.add("c");
		b.add("b"); c.add("d");
		a.addAll(b);
		a.addAll(c);
		System.out.println(a.get(0));
		System.out.println(a.get(3));
	}
}
