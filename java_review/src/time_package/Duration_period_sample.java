package time_package;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Duration_period_sample {
	public static void main(String args[]) {
		LocalDateTime localDateTime1 = LocalDateTime.of(2022, 6, 5, 11, 13, 20, 36);	// 2022.06.05
		LocalDateTime localDateTime2 = LocalDateTime.of(2023, 8, 8, 11, 13, 20, 36);	// 2023.08.08

		// Period 두 기간 사이의 날짜를 계산
		Period period = Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate());
		System.out.println("년차: " + period.getYears());		// 1	
		System.out.println("월차: " + period.getMonths());	// 2
		System.out.println("일차: " + period.getDays());		// 3
		
		System.out.println("누적 월차: " + period.toTotalMonths());
	
		// Duration 두 기간 사이의 시간을 계산
		Duration duration = Duration.between(localDateTime1, localDateTime2);
		System.out.println("누적 일차: " + duration.toDays());
		System.out.println("누적 주차: " + (duration.toDays() / 7));
		System.out.println("초 계산: " + duration.getSeconds());
	}
}

//	Period : 날짜의 간격
//	Duration : 시간의 간격