package chp.one.caelum.java.basics;

import org.apache.log4j.Logger;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question 1.1.1 (page 6) - Choose the appropriate option when attempting to compile 
 * and run the following code:
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
public class Question01 {
	
	private static final Logger logger = Logger.getLogger(Question01.class.getName());

	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			logger.info(i);
		}
		//if this section is uncommented, a compilation error occurs
		//logger.info(i);
	}
}
