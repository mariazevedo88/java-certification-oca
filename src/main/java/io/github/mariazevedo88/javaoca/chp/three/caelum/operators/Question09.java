package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.9 (page 121)
 * 
 * The strange code:
 * 
 * a) Doesn't compile because of class name.
 * b) Doesn't compile because of variable names.
 * c) Compiles, but gives execution error.
 * d) Compiles, run, and prints A76.
 * e) Compiles, run, and prints A75. (x)
 * f) Compiles, run, and prints A74.
 * g) Compiles, run, and prints 76.
 *
 */
class Question09 {
	public static void main(String[] args) {
		int $$ = 5;
		int __ = $$++;
		if(__ < ++$$ || __-- > $$)
			System.out.println("A");
		
		System.out.println($$);
		System.out.println(__);
	}
}
