package io.github.mariazevedo88.javaoca.chp.ten.caelum.wrapper.classes;

class A3 {

    static int i;

    public static void main(String[] args) {
        i = Integer.valueOf("10");
        m1(i + 1);
    }

    private static void m1(Integer j) {
        System.out.println(j);
    }
}