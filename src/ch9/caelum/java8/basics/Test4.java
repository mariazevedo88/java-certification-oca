package ch9.caelum.java8.basics;

/**
 * Alura's Course - Qual dos codigos a seguir NAO imprime >00012.45<? Escolha 1 alternativa:
 * 
 * a) System.out.printf(">%-(8.2f<",12.45); (x)
 * b) System.out.printf(">%0,8.2f<",12.45);
 * c) System.out.format(">%1$08.2f<",12.45);
 * d) System.out.printf(">%0,(8.2f<",12.45);
 * e) System.out.format(">%0(8.2f<",12.45);
 * 
 * @author Mariana Azevedo
 * @since 12/12/2018
 *
 */
public class Test4 {

	public static void main(String[] args) {
		System.out.printf(">%-(8.2f<",12.45);
		System.out.printf(">%0,8.2f<",12.45);
		System.out.format(">%1$08.2f<",12.45);
		System.out.printf(">%0,(8.2f<",12.45);
		System.out.format(">%0(8.2f<",12.45);
	}

}
