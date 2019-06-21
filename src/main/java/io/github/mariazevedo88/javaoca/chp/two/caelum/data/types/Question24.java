package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.24 (page 93) - Given the following class:
 * 
 * class B{
 *	  String msg;
 *	
 * 	  void imprime() {
 *		 if(!msg.isEmpty())
 *			System.out.println(msg);
 *		 else
 *			System.out.println("empty");
 *	  }
 * }
 *
 * class Question24 {
 *	  public static void main(String[] args) {
 *		 new B().imprime();
 *	  }
 * }
 * 
 * What happens if we call new B().imprime()?
 * 
 * a) Doesn't compile. 
 * b) Compiles, but gives an exception when it comes to running. (x)
 * c) Compiles, run and prints nothing.
 * d) Compiles, run and prints "empty".
 */
class L{
	String msg;
	
	void imprime() {
		if(!msg.isEmpty())
			System.out.println(msg);
		else
			System.out.println("empty");
	}
}

class Question24 {
	public static void main(String[] args) {
		new L().imprime();
	}
}
