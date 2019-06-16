package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 05/05/2019
 * 
 * Question 1.2.3 (page 61) - Choose the appropriate option when attempting to 
 * compile and run the following file:
 * 
 * public static void main(String[] args) {
 *		int age;
 *		if(args.length > 0){
 *			age = Integer.parseInt(args[0]);
 *  	}else {
 *			System.err.println("???");
 *			return;
 *  	}
 *  	System.out.println(age);
 * }
 * 
 * a) Does not compile: an error in the line that tries to access the variable age.
 * b) Compiles and prints 0, or the age that is passed on the command line.
 * c) Compiles and prints the age that is passed on the command line.
 * d) Compiles and prints the error message, or prints the age. (x)
 */
public class Question03 {

	public static void main(String[] args) {
		int age;
		if(args.length > 0) {
			age = Integer.parseInt(args[0]);
		}else {
			System.err.println("???");
			return;
		}
		System.out.println(age);
	}

}
