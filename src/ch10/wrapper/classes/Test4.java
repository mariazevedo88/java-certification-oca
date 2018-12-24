package ch10.wrapper.classes;

public class Test4 {
	
	public static void main(String[] args) {
        int a = Integer.parseInt("10",2);
        int b = a == 10 ? null : 3;
        System.out.println(a + b);
    }

}
