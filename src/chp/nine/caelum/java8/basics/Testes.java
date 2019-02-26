package chp.nine.caelum.java8.basics;

/**
 * Alura's Course - Ao tentar compilar e executar o seguinte código, o que é impresso?
 * 
 * a) Todas as linhas imprimem abc
 * b) Linhas A e C imprimem abc (x)
 * c) Linhas A, C e D imprimem abc
 * d) Linha C imprime abc
 * e) Nao compila na linha B
 *  
 * @author Mariana Azevedo
 * @since 12/12/2018
 *
 */
public class Testes {
    public static void main(String[] args) {
        System.out.println(new char[]{'a','b','c'}); // A
        System.out.println(new byte[]{'a','b','c'}); // B
        System.out.println("abc"); // C
        System.out.println(new String[]{"abc"}); // D
    }
}
