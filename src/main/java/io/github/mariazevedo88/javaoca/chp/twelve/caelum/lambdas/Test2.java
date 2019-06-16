package io.github.mariazevedo88.javaoca.chp.twelve.caelum.lambdas;

public class Test2 {

	public static void main(String[] args) {
		
		Calculator<Integer> multiply =  (Integer a,Integer b) -> (int) a * b;
		System.out.println(multiply);
		
		Calculator<Integer> subtract = (a,b) -> {return a - b;};
		System.out.println(subtract);
		
		Calculator<Integer> sum = (a,b) -> a + b;
		System.out.println(sum);
		
		//Calculator<Integer> divide = (int a, int b) -> {return (Integer) a / b;};
	}
}
