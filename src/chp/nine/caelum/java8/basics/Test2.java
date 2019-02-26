package chp.nine.caelum.java8.basics;

/**
 * Alura's Course - Ao tentar compilar e executar o código a seguir, o que acontece?
 * 
 * a)Compila e imprime
     ab
     cd
     e
     
   b) não compila
   c) Compila e imprime
	 ab
     c
     d

     e
   d)Compila e imprime    (x)
     ab
     cd

     e
 * 
 * @author Mariana Azevedo
 * @since 12/12/2018
 *
 */
public class Test2 {
    public static void main(String[] args) {

        System.out.print("a");
        System.out.println("b");
        System.out.printf("c");
        System.out.print("d");
        System.out.println("\n");
        System.out.print("e");
    }
}