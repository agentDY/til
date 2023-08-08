package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_sample {
	// 텍스트를 한 줄씩 읽는 방법 BufferedReader 클래스

	public static void main(String args[]) {
		
		try {
//			File file = new File("C:\\Users\\sunri\\Desktop\\read.txt");
//			FileReader fileReader = new FileReader(file);
//			BufferedReader br = new BufferedReader(fileReader);
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sunri\\Desktop\\read.txt"));
		
//			String line = "";
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
			}
			
			// 입력 스트림을 닫아준다
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

// 참고 유ㅠ:https://youtu.be/uHa6r_-12L4

//	1. 읽기
//	-> 파일의 문자를 한 문자씩 읽는 방법 FileReader 클래스
//	-> 텍스트를 한 줄씩 읽는 방법 BufferedReader 클래스 ★
//	-> 한번에 모두 읽는 방법 Scanner, Files 클래스