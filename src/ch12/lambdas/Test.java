package ch12.lambdas;

import java.util.List;
import java.util.function.Predicate;

public class Test {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Predicate<String> startsWithA = s -> s.startsWith("A");
		System.out.println(startsWithA);
		
		//Predicate<Integer> big = list -> list.size() > 100;
		
		Predicate<List> bigger = list -> list.size() > 1000;
		System.out.println(bigger);
	}
}
