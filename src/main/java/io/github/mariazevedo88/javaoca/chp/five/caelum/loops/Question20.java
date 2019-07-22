package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.20 (page 212) - Choose the appropriate option when attempting to compile 
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
 * a) Doesn't compile. 
 * b) Compiles and prints 0 to 29. (x)
 * c) Compiles and prints nothing.
 * d) Compiles and prints 0 to 19, 21 to 24, 26 to 29.
 * e) Compiles and prints 0 to 24, 26 to 29.
 * f) Compiles and prints 0 to 19.
 */
class Question20 {
	public static void main(String[] args) {
		outside: for(int a=0;a<30;a++)
		for(int b=0;b<1;b++)
		if(a+b==25) continue outside;
		else if(a+b==20) break;
	    else System.out.println(a);
	}
}
