package time_package;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTime_OffsetDateTime_ZonedDateTime_Sample {

	public static void main(String[] args) {
		// 시차를 고려하지 않은 시간과 날짜를 생성
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		// 2023-08-08T14:58:31.979934100
	
		// 시차를 고려한 시간과 날짜 생성
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);						
		// 2023-08-08T14:58:31.981928200+09:00 런던 그리니치와 9시간의 시차가 있음 => +09:00

		// OffsetDateTime에서 날짜를 지정
		OffsetDateTime offsetDateTime1 = OffsetDateTime.of(2023, 2, 3, 8, 23, 18, 53, ZoneOffset.of("+9"));
		System.out.println(offsetDateTime1);						
	
		// 시차와 지역정보를 고려한 시간과 날짜 생성
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println(zoneDateTime);						
		// 시차와 지역정보도 출력됨 2023-08-08T14:58:31.982925800+09:00[Asia/Seoul]
		
		// ZonedDateTime에서 날짜를 지정
		ZonedDateTime zoneDateTime1 = ZonedDateTime.parse("2024-02-03T11:00:12+09:00[Asia/Seoul]");
		System.out.println(zoneDateTime1);
	}
}

// 참고 유튜브: https://youtu.be/QoXBSsNgdT4
// LocalDateTime
// OffsetDateTime
// ZonedDateTime
