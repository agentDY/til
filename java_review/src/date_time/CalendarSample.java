package date_time;

import java.util.Calendar;
import java.util.Date;

public class CalendarSample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DAY_OF_MONTH, 1);	// 하루를 더함 (다음날)
//		cal.add(Calendar.DAY_OF_MONTH, -1);	// 하루를 뺌 (전날)
//		cal.add(Calendar.MONTH, 2);			// 월을 더함 (2달 뒤)
//		cal.add(Calendar.MONTH, -2);			// 월을 뺌 (2달 전)

		// 출력용 캘린터클래스에서 date클래스를 얻어온다
		Date date = cal.getTime();	//데이트 자료형으로 받아온다
		System.out.println(date);
		
		int intMonth = 0;
		cal.set(Calendar.DAY_OF_MONTH, 1);
		intMonth = cal.get(Calendar.MONTH) + 1;	// 0월부터 시작하기 때문에 이번달을 표시하려면 +1을 해주어야한다
		System.out.println(intMonth);
	}
}

//	캘린더 인스턴스를 생성하는 방법은 new 키워드로 생성 불가능 => 캘린더 클래스의 getInstance() 메서드를 사용

//	캘린더객체.add메소드 (캘린터클래스상수, 변동할 양);

//	캘린터클래스상수
//	YEAR
//	MONTH
//	DATE
//	DAY_OF_MONTH (DATE와 동일)
//	HOUR_OF_DAY(24시간제)
//	HOUR(12시간제)
//	MINUTE(분)
//	SECOND(초)
//	MILLISECOND(밀리초)