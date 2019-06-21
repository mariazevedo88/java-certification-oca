package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.18 (page 79) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class I{
 *	  void x(int...x) {
 *		 System.out.println(x.length);
 *	  }
 * }
 *
 * class Question18 {
 *	  public static void main(String[] args) {
 *		 new I().x(23789, 673482);
 *	  }
 * }
 * 
 * a) Doesn't compile: varargs has method and no length attribute.
 * b) Compiles and, when running, prints the two numbers.
 * c) Compiles and, when rotating, prints 2. (x)
 */
class I{
	void x(int...x) {
		System.out.println(x.length);
	}
}

class Question18 {
	public static void main(String[] args) {
		new I().x(23789, 673482);
	}
}
