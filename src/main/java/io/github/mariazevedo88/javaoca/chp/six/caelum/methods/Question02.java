package io.github.mariazevedo88.javaoca.chp.six.caelum.methods;

/**
 * @author Mariana Azevedo
 * @since 26/08/2019
 * 
 * Question 1.6.2 (page 222) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		 x(args.length);
 *	  }
 *	  static int x(final int l) {
 *		 for(int i=0; i<100; i++) {
 *			switch(i) {
 *				case 1:
 *					System.out.println(l);
 *					if(l==i) return 3;
 *				case 0:
 *					System.out.println(0);
 *			}
 *		 }
 *		 System.out.println("End");
 *		 return -1;
 *	  }
 * }
 * 
 * a) Doesn't compile. 
 * b) Compiles and, when run with five parameters, prints 0, 5, and end.
 * c) Compiles and, when run with five parameters, prints 0, 5, -1, and end.
 * d) Compiles and, when run with five parameters, prints 0 and 5.
 * e) Compiles and, when run with five parameters, prints 0, 5, and -1.
 * f) Compiles and, when run with five parameters, prints 0, 5, 0, and end. (x)
 * g) Compiles and, when run with five parameters, prints 0, 5, 0, -1, and end.
 * h) Compiles and, when run with five parameters, prints 0 and 5.
 * i) Compiles and, when run with five parameters, prints 0, 5, 0, and -1.
 */
class Question02 {
	public static void main(String[] args) {
		x(args.length);
	}
	static int x(final int l) {
		for(int i=0; i<100; i++) {
			switch(i) {
				case 1:
					System.out.println(l);
					if(l==i) return 3;
				case 0:
					System.out.println(0);
			}
		}
		System.out.println("End");
		return -1;
	}
}
