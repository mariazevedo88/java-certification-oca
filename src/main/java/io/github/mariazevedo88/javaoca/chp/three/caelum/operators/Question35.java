package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.35 (page 154) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 int count = args.length;
 *		 switch(count){
 *			case 0 {
 *				System.out.println("---");
 *				break;
 *		 	} case 1 {
 *		 	} case 2 {
 *				System.out.println("ok");
 *			} default {
 *				System.out.println("default");
 *			}
 *		 }
 *	  }
 * }
 * 
 * a) Compile error. (x)
 * b) If you run with 1 argument, print ok and one more message.
 * c) If you run with 1 argument, it doesn't print anything.
 * d) If you run with 5 arguments, print default.
 */
class Question35 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int count = args.length;
		//switch(count){
			//case 0 {
				System.out.println("---");
			//	break;
			//} case 1 {
			//} case 2 {
				System.out.println("ok");
			//} default {
				System.out.println("default");
			//}
		//}
	}
}
