package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 16/06/2019
 * 
 * Question 1.2.15 (page 75) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class B{
 * }
 *
 * class A {
 *	  public static void main(String[] args) {
 *		B b = new B();
 *		for(int i = 0; i<10; i++)
 *			b = new B();
 *		System.out.println("end!");
 *	  }
 * }
 * 
 * a) Doesn't compile.
 * b) Compiles and 10 B-type objects can be garbage collected upon reaching the System.out line. (x)
 * c) Compiles and 11 B-type objects can be garbage collected upon reaching the System.out line. 
 * d) Compile and garbage collects 11 type B objects in the System.out row.
 */
class E {
}

public class Question15 {

	public static void main(String[] args) {
		E e = new E();
		for(int i = 0; i<10; i++)
			e = new E();
		System.out.println("end!");
	}

}
