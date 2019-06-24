package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.25 (page 94) - Given the following class:
 * 
 * class B{
 * 	  void imprime() {
 *	     String msg;
 *		 if(!msg.isEmpty())
 *			System.out.println(msg);
 *		 else
 *			System.out.println("empty");
 *	  }
 * }
 *
 * class Question25 {
 *	  public static void main(String[] args) {
 *		 new B().imprime();
 *	  }
 * }
 * 
 * What happens if we call new B().imprime()?
 * 
 * a) Doesn't compile. (x)
 * b) Compiles, but gives an exception when it comes to running.
 * c) Compiles, run and prints nothing.
 * d) Compiles, run and prints "empty".
 */
class M{
	@SuppressWarnings("unused")
	void imprime() {
		String msg;
		//if(!msg.isEmpty())
		//	System.out.println(msg);
		//else
		//	System.out.println("empty");
	}
}
class Question25 {

	public static void main(String[] args) {
		new M().imprime();
	}

}
