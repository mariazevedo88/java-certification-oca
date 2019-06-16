package io.github.mariazevedo88.javaoca.chp.twelve.caelum.lambdas;

class A {
    public static void main(String[] args) {
    	Printer p = null;
        p = () -> System.out.println("Hello World");
        p.printMessage();
    }
}