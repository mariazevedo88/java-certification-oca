package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.30 (page 145) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 if(args.length==1)
 *		 	System.out.println("one");
 *		 elseif (args.length==2)
 *		 	System.out.println("two");
 *		 elseif (args.length==3)
 *			System.out.println("three");
 *       else
 *       	System.out.println("four");
 *	  }
 * }
 * 
 * a) Doesn't compile. (x) 
 * b) Executes and prints "one" when we pass an argument. 
 * c) Executes and prints "three" when we pass an argument.
 * d) Executes and doesn't print anything when we pass any arguments. 
 */
class Question30 {
	public static void main(String[] args) {
		if(args.length==1)
			System.out.println("one");
		//elseif (args.length==2)
			System.out.println("two");
		//elseif (args.length==3)
			System.out.println("three");
		//else
			System.out.println("four");
	}
}
