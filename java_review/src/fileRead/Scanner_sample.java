package fileRead;

import java.io.*;
import java.util.*;

public class Scanner_sample {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\sunri\\Desktop\\read.txt");
		
		try {
			// 한번에 모두 읽는 방법 Scanner 클래스
			Scanner scan = new Scanner(file);
			
			System.out.println(scan.useDelimiter("\\z").next());
			
			scan.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
	}	
}

//	Scanner 클래스로 한 번에 읽어오기

//	Scanner(source)
//	hasNextLine()
//	userDelimiter(pattern) => 구분문자를 패턴으로 설정
//	next()
//	nextLint()

//	nextLine() => while 루프로 반복
//	hasNextLine() => boolean

//	* 정규표현식으로 마지막행까지 데이터를 가져올 수 있음 \z 로 파일 끝을 판정하고 그 때까지의 텍스트를 모두 가져온다