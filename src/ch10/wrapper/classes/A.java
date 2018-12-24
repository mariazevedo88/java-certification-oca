package ch10.wrapper.classes;

class A {
    public static void main(String[] args) {
        int i = 10;
        m1(i);
    }

    private static void m1(Integer j) {
        System.out.println("go!");
    }
}