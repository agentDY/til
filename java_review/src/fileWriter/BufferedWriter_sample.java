package fileWriter;

import java.io.*;

public class BufferedWriter_sample {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\sunri\\Desktop\\read1.txt");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			if(file.isFile() && file.canWrite()) {
				
				// 처음부터 새로 기입된다
				// 문자열 쓰기
				bw.write("추가할 문자1");
				// 개행 추가
				bw.newLine();
				// 문자열 쓰기
				bw.write("추가할 문자2");
				// 개행 추가
				bw.newLine();
				
				bw.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

//	참고 유튜브: https://youtu.be/tTUJP6FyOtY

//1. FileWriter 클래스를 이용해서 파일 쓰기 
//2. BufferedWriter 클래스를 이용해서 파일 쓰기 ★
//3. Files 클래스를 이용해서 파일 쓰기

//	> 생성자
//	BufferedWriter(out) > 기본크기 출력버퍼 확보 후 출력스트림 생성
//	BufferedWiter(out, size) 지정한 크기로 출력버퍼 확보

//	> 메소드
//	write(str) 문자열 기록
//	newLine() 개행문자기록
//	close() 출력스트림 닫기

//	BufferedWriter => FileWriter

//	* 래핑
//	File file = new File("");
//	FileWriter fw = new FileWriter(file);
//	BufferedWriter bw = new BufferedWriter(fw);

//	* 래핑2
//	File file = new File("");
//	BufferedWriter bw = new BufferedWriter(new FileWriter(file));

//	bw.newLine() 개행코드 출력

