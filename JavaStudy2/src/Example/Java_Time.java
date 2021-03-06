package Example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Java_Time {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		LocalDate ld1 = LocalDate.of(2020, Month.FEBRUARY, 1);
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = time.toLocalDate();
		System.out.println(theDate);
		
		Month month = time.getMonth();
		System.out.println(time.getMonth());
		System.out.println(month.getValue());
		System.out.println(time.getHour());
	}

}
