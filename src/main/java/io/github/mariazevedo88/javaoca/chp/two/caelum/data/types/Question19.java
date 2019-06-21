package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.19 (page 80) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class J{
 *	  void x(int...x) {
 *		 System.out.println(x.length);
 *	  }
 * }
 *
 * class Question19 {
 *	  public static void main(String[] args) {
 *		 new J().x(new int[]{23789, 673482});
 *	  }
 * }
 * 
 * a) Doesn't compile: varargs has method and no length attribute.
 * b) Doesn't compile: we cannot pass an array to a vargars.
 * c) Compiles and, when running, prints the two numbers.
 * d) Compiles and, when rotating, prints 1.
 * e) Compiles and, when rotating, prints 2. (x)
 */
class J{
	void x(int...x) {
		System.out.println(x.length);
	}
}

class Question19 {
	public static void main(String[] args) {
		new J().x(new int[]{23789, 673482});
	}
}
