package chp.one.caelum.java.basics;

import org.apache.log4j.Logger;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question 1.1.3 (page 7) - Choose the appropriate option when attempting to compile 
 * and run the following code:
 * 
 * public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			System.out.println(i);
		}
		int i = 15;
		System.out.println(i);
	}
 * 
 * a) Compile error in line 6. The variable i can not be redeclared
 * b) Compile error on line 7. The variable i is ambiguous
 * c) The code compiles and runs, printing from 0 to 19 and then 15 (x)
 * d) The code compiles and runs, printing from 0 to 19, then a runtime error occurs on line 6
 * e) The code compiles and runs, printing from 0 to 19 and then 19 again
 *
 */
public class Question03 {
	
	private static final Logger logger = Logger.getLogger(Question03.class.getName());

	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			logger.info(i);
		}
		int i = 15;
		logger.info(i);
	}

}
