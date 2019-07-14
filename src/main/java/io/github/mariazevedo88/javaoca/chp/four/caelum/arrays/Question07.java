package io.github.mariazevedo88.javaoca.chp.four.caelum.arrays;

/**
 * @author Mariana Azevedo
 * @since 14/07/2019
 * 
 * Question 1.4.7 (page 169) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 * 
 * class A {
 *	  public static void main(String[] args) {
 *		String[] valores = new String[2];
 *		valores[0] = "Certification";
 *		valores[1] = "Java";
 *		Object [] vals = (Object[]) valores;
 *		vals[1] = "Daniela";
 *		System.out.println(vals[1].equals(valores[1]));
 *	  } 
 * }
 * 
 * a) The code doesn't compile. 
 * b) The code compiles and gives execution error. 
 * c) The code compiles and prints false.
 * d) The code compiles and prints true. (x)
 */
class Question07 {
	public static void main(String[] args) {
		String[] valores = new String[2];
		valores[0] = "Certification";
		valores[1] = "Java";
		Object [] vals = (Object[]) valores;
		vals[1] = "Daniela";
		System.out.println(vals[1].equals(valores[1]));
	}
}
