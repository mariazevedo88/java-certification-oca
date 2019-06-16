package io.github.mariazevedo88.javaoca.chp.eleven.caelum.java.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1988, 7, 22);
		LocalDate base = LocalDate.now();

		// 30 anos no total
		System.out.println(ChronoUnit.YEARS.between(birthday, base)); 
		// 365 meses no total
		System.out.println(ChronoUnit.MONTHS.between(birthday, base)); 
		// 11111 dias no total
		System.out.println(ChronoUnit.DAYS.between(birthday, base));
		
		Period tempoDeVida = Period.between(birthday, base);
		System.out.println(tempoDeVida.getYears());
		System.out.println(tempoDeVida.getMonths());
		System.out.println(tempoDeVida.getDays());
		
	}
}
