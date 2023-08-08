package date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMethodSample {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal1.set(Calendar.DAY_OF_MONTH, 1);
		cal2.set(Calendar.DAY_OF_MONTH, 2);
		cal3.set(Calendar.DAY_OF_MONTH, 2);
		
		System.out.println(cal1.getTime());
		System.out.println(cal2.getTime());
		System.out.println(cal3.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String formattedCal1 = sdf.format(cal1.getTime());
		String formattedCal2 = sdf.format(cal2.getTime());
		String formattedCal3 = sdf.format(cal3.getTime());
		
		System.out.println(formattedCal1);
		System.out.println(formattedCal2);
		System.out.println(formattedCal3);
	
		// compareTo(미래면 1, 과거면-1, 같으면 0)
		int comResult1 = cal1.compareTo(cal2);
		System.out.println(comResult1);			// -1
		int comResult2 = cal2.compareTo(cal1);	
		System.out.println(comResult2);			// 1
		int comResult3 = cal2.compareTo(cal3);
		System.out.println(comResult3);			// 0
	}
}

//	Calendar의 비교메서드
//	after
//	before
//	equals
//	compareTo(미래면 1, 과거면-1, 같으면 0)
	

