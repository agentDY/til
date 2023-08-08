package fileWriter;

import java.io.*;

public class FileWriter_sample {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\sunri\\Desktop\\read.txt");
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("\r\n 똘이에게 보내는 메시지1 \r\n");
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

// 참고 유튜브: https://youtu.be/5V92FveosDg

//	1. FileWriter 클래스를 이용해서 파일 쓰기 ★
//	2. BufferedWriter 클래스를 이용해서 파일 쓰기
//	3. Files 클래스를 이용해서 파일 쓰기

//	1. FileWriter 클래스의 생성자
//	FileWriter(file)
//	FileWriter(file, append) > append가 true인 경우 파일에 추가로 기록, false인 경우 처음부터 기록

//	FileWriter(fileName) > 지정한 파일명으로 생성
//	FileWriter(fileName, append) > append가 true인 경우 파일에 추가로 기록, false인 경우 처음부터 기록

//	> 메소드
//	write(string) 지정한 문자열 출력
//	close()

//	File file = new File("경로");
//	FileWriter fw = new FileWriter(file, true); =>  한줄로도 생성가능 FileWriter fw = new FileWriter("경로");

//	fw.write("출력할 문자열");

//	-> 지정한 파일이 없을 때 파일을 만드는데
//	-> 경로가 없으면 io예외발생

