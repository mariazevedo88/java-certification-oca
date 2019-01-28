package ch1.ocawiley.java.basics;

/**
 * Book OCA-Oracle Certified Associate Java SE 8 Programmer I Study Guide Exam 1Z0-808
 * 
 * Question 2: What is the result of the following code?
 * 
 * String s1 = "Java";
 * String s2 = "Java";
 * StringBuilder sb1 = new StringBuilder();
 * sb1.append("Ja").append("va");
 * System.out.println(s1 == s2);
 * System.out.println(s1.equals(s2));
 * System.out.println(sb1.toString() == s1);
 * System.out.println(sb1.toString().equals(s1));  
 * 
 * a) true is printed out exactly once.
 * b) true is printed out exactly twice.
 * c) true is printed out exactly three times. (x)
 * d) true is printed out exactly four times.
 * e) The code does not compile.
 * 
 * @author Mariana Azevedo
 * @since 11/12/2018
 *
 */
public class StringBuilderQuestion {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}

}
