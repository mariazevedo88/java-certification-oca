package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.21 (page 185) - Choose the appropriate option when attempting to compile 
 * and run the following file: 
 * 
 * import java.util.ArrayList;
 * class A {
 *	  public static void main(String[] args) {
 *		 ArrayList<String> ss = new ArrayList<String>();
 *		 ss.add("a");
 *       ss.add("b");
 *       ss.add("c");
 *       ss.add("d");
 *       
 *		 for(String s : ss) {
 *		 	if(s.equals("c")) s = "b";
 *		 	else if(s.equals("b")) s = "c";
 *		 }
 *		 for(String s : ss) System.out.println(s);
 *	  }
 * }
 * 
 * a) Doesn't compile, s is final by default.  
 * b) Compiles and prints a,c,b,d. 
 * c) Compiles and prints a,b,c,d. (x)
 * d) Compiles and prints a,c,c,d.
 * e) Compiles and prints a,c,d,b.
 */
class Question21 {
	public static void main(String[] args) {
		ArrayList<String> ss = new ArrayList<String>();
		ss.add("a"); 
		ss.add("b");
		ss.add("c"); 
		ss.add("d");
		
		for(String s : ss) {
			if(s.equals("c")) s = "b";
			else if(s.equals("b")) s = "c";
		}
		for(String s : ss) System.out.println(s);
	}
}
