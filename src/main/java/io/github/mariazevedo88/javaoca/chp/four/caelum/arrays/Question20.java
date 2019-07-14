package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.*;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.20 (page 184) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		 ArrayList<String> a = new ArrayList<String>();
 *		 a.add(0, "b"); 
 *       a.add(0, "a");
 *		 for(Iterator<String> i=a.iterator();i.hasNext();i.next()) {
 *		 	String element = i.next();
 *		 	System.out.println(element);
 *		 }
 *	  }
 * }
 * 
 * a) Doesn't compile.  
 * b) Compiles and prints a. (x)
 * c) Compiles and prints a and b.
 * d) Compiles and prints b and a.
 * e) Compiles and prints b.
 */
class Question20 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "b"); 
		a.add(0, "a");
		for(Iterator<String> i=a.iterator();i.hasNext();i.next()) {
			String element = i.next();
			System.out.println(element);
		}
	}
}
