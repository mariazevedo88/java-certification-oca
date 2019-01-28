package ch9.caelum.java8.basics;

/**
 * Alura's Course - O que acontece ao compilar e executar o código a seguir?
 * 
 * a) Compila e executa normalmente (x)
 * b) Erro de compilacao na linha B
 * c) Erro de compilacao na linha C
 * d) Erro de compilacao na linha A
 * e) Erro de compilacao nas linhas B e C
 * 
 * @author Mariana Azevedo
 * @since 12/12/2018
 *
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.printf("%s",12); //A
        System.out.printf("%d",new Integer(321)); //B
        System.out.printf("%d",(short)(byte)(double) 127); //C
    }
}
