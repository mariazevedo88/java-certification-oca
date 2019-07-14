package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.15 (page 181) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		ArrayList<String> c = new ArrayList<String>();
 *		c.add("a");
 *		c.add("a");
 *		System.out.println(c.remove("a"));
 *		System.out.println(c.size());
 *	  }
 * }
 * 
 * a) Doesn't compile: error declaring the ArrayList.  
 * b) Doesn't compile: error when invoking remove. 
 * c) Compiles and, when run, prints a and 0.
 * d) Compiles and, when run, prints true and 0.
 * e) Compiles and, when run, prints a and 1. 
 * f) Compiles and, when run, prints true and 1. (x)
 * g) Compiles and, when run, prints a and 2.
 * h) Compiles and, when run, prints true and 2.
 */
class Question15 {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("a");
		System.out.println(c.remove("a"));
		System.out.println(c.size());
	}
}
