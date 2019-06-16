package io.github.mariazevedo88.javaoca.chp.ten.caelum.wrapper.classes;

public class Test {
    static long i;

    public static void main(String[] args) {
        i = Integer.valueOf("10",8); // A
        //m1(i); // B
    }

    @SuppressWarnings("unused")
	private static void m1(Integer j) { // C
        System.out.println(j);
    }
}