package ch1.caelum.java.basics;

/**
 * @author Mariana Azevedo
 * @since 27/01/2019
 * 
 * Choose an appropriate option when compile and run the following file:
 * 
 * a) Does not compile: array has no member length
 * b) Does not compile: the println method can not print an array
 * c) When running without arguments, an ArrayIndexOutOfBoundsException occurs on line C. (x)
 * d) When running without arguments, a NullPointerException occurs on line B.
 * e) When running without arguments, the values "1" and "A"
 * f) When running with the "certification" argument, the values "2" and "A"
 * 
 */
public class Question09 {

	public static void main(String[] args) {
		System.out.println(args); //A
		System.out.println(args.length); //B
		System.out.println(args[0]); //C
	}

}
