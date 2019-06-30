package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 29/06/2019
 * 
 * Question 1.3.34 (page 154) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class A {
 *	  public static void main(String[] args) {
 *		 switch("Guilherme") {
 *       	case "Guilherme":
 *       		System.out.println("Guilherme");
 *       		break;
 *			case "42":
 *				System.out.println("42");
 *			default:
 *				System.out.println("Mario");
 *		 }
 *	  }
 * }
 * 
 * a) It doesn't compile because a number cannot be compared to String.
 * b) Compile and print Guilherme. (x)
 * c) It doesn't compile, since the code of case 42 and default will never be executed.
 */
class Question34 {
	public static void main(String[] args) {
		switch("Guilherme") {
			case "Guilherme":
				System.out.println("Guilherme");
				break;
			case "42":
				System.out.println("42");
			default:
				System.out.println("Mario");
		}
	}
}
