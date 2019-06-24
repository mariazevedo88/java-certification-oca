package io.github.mariazevedo88.javaoca.chp.one.caelum.java.basics;

import org.apache.log4j.Logger;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question 1.1.5 (page 8) - Choose the appropriate option when attempting to compile 
 * and run the following code:
 * 
 * class Test {
 *    static int i = 3;
 *    public static void main(String[] args) {
 *		 for(new Question5().i = 10; new Question5().i < 100; new Question5().i++) {
 *			System.out.println(i);
 *		 }
 *    }
 * }
 * 
 * a) Doesn't compile line 4
 * b) Doesn't compile line 5
 * c) Compiles and prints 100 times the number 3
 * d) Compiles and prints the numbers from 10 to 99 (x)
 *
 */
class Question05 {

	private static final Logger logger = Logger.getLogger(Question05.class.getName());
	static int i = 3;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		for(new Question05().i = 10; new Question05().i < 100; new Question05().i++) {
			logger.info(i);
		}
	}
}
