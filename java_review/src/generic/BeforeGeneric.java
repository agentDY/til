package generic;

import java.util.*;

public class BeforeGeneric {
	// 제네릭타입을 사용하지 않은 클래스
	public static void main(String[] args) {
		
		// List 생성
		List list = new ArrayList();
		
		// 리스트에 요소 추가
		list.add(13);
		
		// 리스트 요소 출력
		int num = (Integer)list.get(0);	// Object 자료형을 Integer로 형변환해줘야한다
		System.out.println(num);
	}
}

// 참고 유튜브: https://youtu.be/l4jMar77gsA
