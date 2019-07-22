package io.github.mariazevedo88.javaoca.chp.five.caelum.loops;

/**
 * @author Mariana Azevedo
 * @since 21/07/2019
 * 
 * Question 1.5.21 (page 213) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 int a = args.length;
 *       int i = 0;
 *       switch(a) {
 *       	case 0:
 *       	case 1:
 *       	for(i=0;i<15;i++,System.out.println(i))
 *       	if(i==5) continue;
 *       	if(i==15) break;
 *       	case 2:
 *       	System.out.println("2");
 *       }
 *       System.out.println("end");
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compile and when running with 0 arguments prints 0 to 14, 2, end.
 * c) Compile and when running with 0 arguments prints 0 to 15, 2, end.
 * d) Compile and when running with 0 arguments prints 0 to 4, 6 to 14, 2, end.
 * e) Compile and when running with 0 arguments prints 1 to 4, 6 to 15, end.
 * f) Compile and when running with 0 arguments prints 0 to 4, 6 to 9, 2, end.
 * g) Compile and when running with 0 arguments prints 1 to 4, 6 to 9, end.
 * h) Compile and when running with 0 arguments prints 1 to 4, 6 to 15, 2, end.
 * i) Compile and when running with 0 arguments prints 1 to 15, 2, end.
 * j) Compile and when running with 0 arguments prints 1 to 15, end. (x)
 */
class Question21 {
	public static void main(String[] args) {
		int a = args.length;
		int i = 0;
		switch(a) {
			case 0:
			case 1:
			for(i=0;i<15;i++,System.out.println(i))
			if(i==5) continue;
			if(i==15) break;
			case 2:
			System.out.println("2");
		}
		System.out.println("end");
	}
}
