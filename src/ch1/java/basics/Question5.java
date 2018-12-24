package ch1.java.basics;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question: choose the appropriate option when attempting to compile 
 * and run the following code
 * 
 * static int i = 3;
   public static void main(String[] args) {
		for(new Question5().i = 10; new Question5().i < 100; new Question5().i++) {
			System.out.println(i);
		}
   }
 * 
 * a) Doesn't compile line 4
 * b) Doesn't compile line 5
 * c) Compiles and prints 100 times the number 3
 * d) Compiles and prints the numbers from 10 to 99 (x)
 *
 */
public class Question5 {

	static int i = 3;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		for(new Question5().i = 10; new Question5().i < 100; new Question5().i++) {
			System.out.println(i);
		}
	}
}
