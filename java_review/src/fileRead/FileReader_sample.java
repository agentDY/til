package fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_sample {

	public static void main(String args[]) {

		// 한 문자씩 읽어들이는 방법 FileReader
		
		try {
			// 파일 객체 생성
			File file = new File("C:\\Users\\sunri\\Desktop\\read.txt");
			
			// 입력스트림 객체 생성
			FileReader fileReader = new FileReader(file);
			
			// while 문으로 파일 읽어오기
			int singleCh = 0;
			while((singleCh = fileReader.read()) != -1) {
				System.out.print((char)singleCh);
			}
			
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}

// 참고 유튜브: https://youtu.be/Am3MIhlQMYc

//	1. 읽기
//	-> 파일의 문자를 한 문자씩 읽는 방법 FileReader 클래스 ★
//	-> 텍스트를 한 줄씩 읽는 방법 BufferedReader 클래스
//	-> 한번에 모두 읽는 방법 Scanner, Files 클래스