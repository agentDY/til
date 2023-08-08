package arr_collection;

public class Arr_sample {
	public static void main(String args[]) {
		
		// 자료형[] 배열명 = new 자료형[배열길이지정];
		String[] strarr = new String[3];
		
		// 배열 strarr에 값을 넣기
		strarr[0] = "Hello, World!";
		strarr[1] = "Hello, Java!";
		strarr[2] = "Good Bye!";
//		strarr[3] = "String[3] 에서 지정해준 배열길이를 벗어나기때문에 에러가 발생합니다.";

		// 값을 가져오기 => 배열객체명[인덱스번호] 
		for(int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
	}
}

// 참고 유튜브: https://youtu.be/8dIWSQNHF9s

