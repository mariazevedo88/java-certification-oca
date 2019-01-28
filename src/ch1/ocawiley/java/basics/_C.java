package ch1.ocawiley.java.basics;

/**
 * Book OCA-Oracle Certified Associate Java SE 8 Programmer I Study Guide Exam 1Z0-808
 * 
 * Question 1: What is the result of the following class? (Choose all that apply)
 * 1: public class _C {
 * 2:   private static int $;
 * 3:   public static void main (String [] main){
 * 4:      String a_b;
 * 5:      System.out.println($);
 * 6:      System.out.println(a_b);
 * 7:   }}   
 * 
 * a) Compiler error on line 1.
 * b) Compiler error on line 2.
 * c) Compiler error on line 4.
 * d) Compiler error on line 5.
 * e) Compiler error on line 6. (x)
 * f) 0null
 * g) nullnull
 * 
 * @author Mariana Azevedo
 * @since 11/12/2018
 *
 */
public class _C {
	
	private static int $;

	public static void main(String[] main) {
		
		@SuppressWarnings("unused")
		String a_b;
		System.out.println($);
		//System.out.println(a_b);
	}

}
