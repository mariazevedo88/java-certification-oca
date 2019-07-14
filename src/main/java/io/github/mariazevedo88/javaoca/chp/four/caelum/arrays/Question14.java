package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.14 (page 180) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		ArrayList<String> c = new ArrayList<String>();
 *		c.add("a");
 *		c.add("c");
 *		System.out.println(c.remove("a"));
 *	  }
 * }
 * 
 * a) Doesn't compile: error declaring the ArrayList.  
 * b) Doesn't compile: error when invoking remove. 
 * c) Compiles and, when run, prints a.
 * d) Compiles and, when run, prints true. (x)
 * e) Compiles and, when run, prints false.
 */
class Question14 {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("c");
		System.out.println(c.remove("a"));
	}
}
