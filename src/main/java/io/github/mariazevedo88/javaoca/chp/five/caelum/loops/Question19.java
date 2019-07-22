package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.19 (page 211) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 outside: for(int a=0;a<30;a++)
 *       for(int b=0;b<1;b++)
 *       if(a+b==25) continue outside;
 *       else if(a+b==20) break outside;
 *       if(a==0) break outside;
 *       else System.out.println(a);
 *	  }
 * }
 * 
 * a) Doesn't compile. (x)
 * b) Compiles and prints 1 to 29.
 * c) Compiles and prints nothing.
 * d) Compiles and prints 1 to 19, 21 to 24, 26 to 29.
 * e) Compiles and prints 1 to 24, 26 to 29.
 * f) Compiles and prints 1 to 19.
 */
class Question19 {
	public static void main(String[] args) {
		outside: for(int a=0;a<30;a++)
		for(int b=0;b<1;b++)
		if(a+b==25) continue outside;
		else if(a+b==20) break outside;
	    //if(a==0) break outside;
	    //else System.out.println(a);
	}
}
