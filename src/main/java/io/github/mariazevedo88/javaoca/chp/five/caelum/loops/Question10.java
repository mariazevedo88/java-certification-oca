package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.10 (page 199) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 if(args.length < 10) {
 *          do {
 *             if(args.length>2) return;
 *          } while(true);
 *       }
 *       System.out.println("finished"); 
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and enters an infinite loop if past zero, one or two arguments. 
 * Does not print anything in case 3 to 9 arguments. Prints 'finished' if 10 or more arguments. (x)
 * c) Compiles and enters an infinite loop if past zero, one or two arguments. Otherwise, print 'finished'.
 * d) Compiles and always goes into infinite loop.
 */
class Question10 {
	public static void main(String[] args) {
		if(args.length < 10) {
			do {
				if(args.length>2) return;
			} while(true);
		}
		System.out.println("finished");
	}
}
