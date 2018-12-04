package ch1.java.basics;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question: choose the appropriate option when attempting to compile 
 * and run the following code
 * 
 * public static void main(String[] args) {
	for (int i=0; i<20; i++) {
		System.out.println(i);
	}
	System.out.println(i);
   }
 * 
 * a) Compilation error (x)
 * b) The code compiles and runs, printing from 0 to 19 and then 19
 * c) The code compiles and runs, printing from 0 to 19, then a runtime error occurs
 * 
 */
public class Question1 {

	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			System.out.println(i);
		}
		//if this section is uncommented, a compilation error occurs
		//System.out.println(i);
	}

}
