package arr_collection;

import java.util.*;

public class Collection_sample {

	public static void main(String[] args) {
		System.out.println("=================== List ===================");
		// List => 인덱스 존재 (순서가 있음)
		List list = new ArrayList();
		list.add(0, "사과");
		list.add(1, "배");
		list.add(2, 123);
//		list.clear();	// 리스트 객체 내용물을 삭제 (리스트객체를 비워준다)
		
		// 리스트 객체 안의 값을 가져와서 출력해주기 => 리스트객체.get(인덱스번호)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		List<String> list2 = new ArrayList<>();
		list2.add("똘이");
		list2.add("사랑");
		list2.add("나라");
		list2.add("사랑!!!");
//		list2.add(123); // 제네릭타입으로 설정했을 때 String 자료형만 넣을 수 있음

		list2.set(2, "진짜");	// "나라" 로 설정했던 값을 수정
		
		System.out.println("=================== List 출력 > for문 이용 ===================");
		// for문 이용
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + " 인덱스의 값: " + list2.get(i));
		}

		System.out.println("=================== List 출력 > for콜론문 이용 ===================");
		// for콜론 이용
		for(String str : list2) {
			System.out.println("str의 값: " + str);		// list2 안에 있는 요소 하나하나를 가져와서 str으로 출력해줌
			System.out.println("str의 값: " + list2);		// list2 객체 안에 있는 전체 요소를 다 찍어준다 (반복해서)
		}

		System.out.println("=================== List 출력 > Iterator 이용 ===================");
		// Iterator 이용
		Iterator<String> iter = list2.iterator();
		
		// Iterator를 이용한 반복출력
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		System.out.println("=================== Set ===================");
		// Set => 순서가 없음 (아무렇게나 출력해준다)
		Set set = new HashSet();
		set.add("사과");
		set.add("배");
		set.add("포도");
		set.add("사과");	// 중복된 값은 에러는 발생하지않지만 값이 저장되지는 않는다 => 출력하면 [사과, 배] 만 나옴
		
		System.out.println(set.toString());
		
		
		System.out.println("=================== Set 출력 > for콜론문 이용 ===================");

		Set<String> set1 = new HashSet<>();
		set1.add("똘이");
		set1.add("행복해");
		set1.add("사랑해");
		
//		set1.remove("행복해");	// 요소를 삭제
//		set1.clear();			// 모든 요소를 삭제
		
		System.out.println(set1.contains("똘이"));	// true 출력
		
		// for콜론 이용
		for(String str : set1) {
			System.out.println(str);
		}
		
		System.out.println("=================== Set 출력 > Iterator 이용 ===================");
		// Iterator 이용
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			String str = (String) it.next();
			System.out.println("이터레이터를 이용한 '" + str + "'");
		}
		
		System.out.println("=================== Map ===================");
		//	Map<K,V> 변수 = new HashMap();

		// Map => Key:Value 로 구성
		Map map = new HashMap();
		map.put("과일", "사과");
		map.put("채소", "당근");
		map.put("강아지", "똘이");
		
		System.out.println(map.toString());		// {채소=당근, 과일=사과, 강아지=똘이}
		System.out.println(map.get("강아지"));	// 맵객체.get(키) 똘이

		System.out.println("=================== Map 출력 > for콜론문 이용 ===================");
		Map<Integer, String> map1 = new HashMap();
		
		map1.put(1, "똘이야");
		map1.put(2, "사랑해");
		map1.put(3, "행복해");
		
//		map1.put(2, "천국에서");	// "사랑해" 값을 변경
//		map1.remove(2);			// 키가 2 인 것을 삭제
		
		System.out.println("map1.keySet()의 값은? " + map1.keySet());
		System.out.println("map1.values()의 값은? " + map1.values());
		
		for(Integer key: map1.keySet()) {	// keySet을 가져와서 모든 요소를 추출할 수 있음
			String value = map1.get(key);
			System.out.println(value);
		}
		
		System.out.println("=================== Map 출력 > Iterator 이용 ===================");
		// Iterator 이용
		Iterator it2 = map1.keySet().iterator();

		while(it2.hasNext()) {
			int key = (Integer)it2.next();
			System.out.println(map1.get(key));
		}
		
		System.out.println("=================== Map 출력 > entrySet 이용 ===================");

		for(Map.Entry<Integer, String> entry: map1.entrySet()) {
			Integer key = (Integer) entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "의 값은 " + value);
		}
		
	}
}

// 참고 유튜브: https://youtu.be/t3S-Uhd1UPM
// 참고 유튭: https://youtu.be/9XETcslRRog > set
// 참고 유튭: https://youtu.be/AVn7QUrcfu0 > map

// List
//	add(e)
//	add(index, element)
//	set(index, element)
//	get(index)
//	remove(index)
//	clear()
//	isEmpty()
//	size() : 요소 개수(객체 길이반환)

// Set
// contains(o) : 포함여부 확인 (boolean)

// Map
//	remove(키)
//	put(키, 밸류)
//	keySet() => 키 목록을 Set 자료형으로 가져옴
//	containsKey(키)
//	containsValue(값)
