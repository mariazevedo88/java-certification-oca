package ch1.caelum.java.basics;

/**
 * @author Mariana Azevedo
 * @since 27/01/2019
 * 
 * Question 1.3.4 (page 28) - Choose the appropriate option to run the class A.java present in directory b, 
 * which was compressed into a file called program.jar, and there is no manifest file:
 * 
 * a) java jar program.jar
 * b) java jar program.jar b.A
 * c) java -jar program.jar
 * d) java -jar program.jar b.A
 * e) java -cp program.jar
 * f) java -cp program.jar b.A (x) 
 *
 */
public class Question10 {

	public static void main(String[] args) {
		System.out.println(args[0]);
	}

}
