package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.3 (page 117) - The following code may throw a NullPointerException. 
 * How to avoid this while keeping the same logic?
 * 
 * void method (Car c){
 * 	  if(c != null & c.getPreco() > 100000){
 *        System.out.println("expensive");
 *    }
 * }
 * 
 * a) Switching != to ==
 * b) Switching > to <
 * c) Switching & to |
 * d) Switching & to && (x)
 */
class Car{
	float preco;
	public float getPreco() {
		return preco;
	}
}

class Question03 {
	public static void main(String[] args) {
		method(null);
	}
	static void method (Car c){
		 if(c != null & c.getPreco() > 100000){
			 System.out.println("expensive");
		 }
	}
}
