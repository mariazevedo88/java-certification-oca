package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.4 (page 118) - Some interesting tests with primitive types:
 * 
 * int i = (byte) 5;
 * long l = 3.0;
 * float f = 0.0;
 * char c = 3;
 * char c2 = -2;
 * 
 * What compile?
 * 
 * a) i, f e c
 * b) i, f, c e c2
 * c) i, f e c2
 * d) i e c (x)
 * e) f e c
 * f) f e c2
 * g) i e 1
 * h) l, f e c
 * i) i, c e c2
 */
class Question04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = (byte) 5;
//		long l = 3.0;
//		float f = 0.0;
		char c = 3;
//		char c2 = -2;
	}
}
