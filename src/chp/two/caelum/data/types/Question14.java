package chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 02/06/2019
 * 
 * Question 1.2.14 (page 74) - Choose the appropriate option when attempting to compile 
 * and run the following file:
 *
 * class D{
 * }
 *
 * class Question14 {
 *	  public static void main(String[] args) {
 *		D d;
 *		for(int i = 0; i<10; i++)
 *			d = new D();
 *		System.out.println("end!");
 *	  }
 * }
 * 
 * a) Doesn't compile.
 * b) Compile and the garbage collects 10 B-type objects in the System.out row.
 * c) Compiles and we cannot tell how many B-type objects were garbage collected 
 * in the System.out row. (x)
 */
class D{
}

class Question14 {
	public static void main(String[] args) {
		D d;
		for(int i = 0; i<10; i++)
			d = new D();
		System.out.println("end!");
	}
}
