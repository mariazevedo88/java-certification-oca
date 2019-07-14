package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.17 (page 183) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		 ArrayList<String> l = new ArrayList<String>();
 *		 l.add("a");
 *		 l.add("b");
 *		 l.add(1, "amor");
 *		 l.add(3, "love");
 *		 System.out.println(l);
 *		 String[] array = l.toArray();
 *		 System.out.println(array);
 *	  }
 * }
 * 
 * a) Doesn't compile. (x)  
 * b) Compiles and prints "love". 
 * c) Compiles and prints "b".
 */
class Question17 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("a"); 
		l.add("b");
		l.add(1, "amor"); 
		l.add(3, "love");
		System.out.println(l);
		//String[] array = l.toArray();
		//System.out.println(array);
	}
}
