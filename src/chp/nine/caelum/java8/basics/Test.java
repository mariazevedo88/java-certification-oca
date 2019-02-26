package chp.nine.caelum.java8.basics;

/**
 * Alura's Course - O que acontece ao tentar compilar e executar o código a seguir?
 * 
 * a) Não compila por erro na linha B (x)
 * b) Compila e imprime
 * c) Não compila por erro na linha A
 * 
 * @author Mariana Azevedo
 * @since 12/12/2018
 *
 */
class Test{
    public static void main(String[] args){
    System.out.print("a");
    System.out.println('b'); // A
    //System.out.print();      // B
    System.out.println("c"); 
    }
}
