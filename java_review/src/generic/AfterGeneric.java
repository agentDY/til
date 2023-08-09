package generic;

import java.util.*;

public class AfterGeneric {
	// 제네릭타입을 사용하지 않은 클래스
	public static void main(String[] args) {

		// List 생성
		List<Integer> list = new ArrayList<>();

		// 리스트에 요소 추가
		list.add(12);

		// 리스트 요소 출력
		int num = list.get(0); // 지정한 자료형(Integer)으로 저장되기때문에 형변환할 필요가 없다
		System.out.println(num);
	}
}

