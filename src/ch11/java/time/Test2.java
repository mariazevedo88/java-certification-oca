package ch11.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		//System.out.println(MonthDay.now().isSupported(ChronoUnit.DAYS));
		System.out.println(LocalDate.now().isSupported(ChronoUnit.DAYS));
		System.out.println(LocalDateTime.now().isSupported(ChronoField.DAY_OF_MONTH));
	}
}
