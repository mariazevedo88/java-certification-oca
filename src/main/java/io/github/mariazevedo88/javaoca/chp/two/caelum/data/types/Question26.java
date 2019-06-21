package io.github.mariazevedo88.javaoca.chp.two.caelum.data.types;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.26 (page 94) - What is the output in the two cases, respectively?
 * 
 * class Question26 {
 *	  public static void main(String[] args) {
 *		 String s = "Caelum";
 *       s.concat(" - Ensino e Inovação");
 *       System.out.println(s);
 *       
 *       StringBuffer s = new StringBuffer("Caelum");
 *       s.append(" - Ensino e Inovação");
 *       System.out.println(s);
 *	  }
 * }
 * 
 * a) Caelum e Caelum - Ensino e Inovação. (x)
 * b) Caelum - Ensino e Inovação e Caelum - Ensino Inovação.
 * c) Caelum e Caelum.
 * d) Caelum - Ensino e Inovação e Caelum.
 */
class Question26 {
	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inovação");
		System.out.println(s);
		      
		StringBuffer sb = new StringBuffer("Caelum");
		sb.append(" - Ensino e Inovação");
		System.out.println(sb);
	}
}
