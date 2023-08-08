package date_time;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FormatSample {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		// 출력용 캘린터클래스에서 date클래스를 얻어온다
		Date date = cal.getTime();	//데이트 자료형으로 받아온다
		System.out.println(date);
		
		// SimpleDateFormat을 이용해서 서식을 지정해주기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 EEE요일 - a hh시 mm분");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
	}
}

// 패턴 참고: https://blog.miyam.net/119
// SimpleDateFormat 패턴
// yy : 2자리 년
// yyyy: 4자리 년
// MM: 월
// dd: 일
// hh: 시
// mm: 분
// ss: 초
// sss: 밀리초
