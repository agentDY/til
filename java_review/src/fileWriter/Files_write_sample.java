package fileWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_write_sample {
	public static void main(String args[]) {

//		File file = new File("C:\\Users\\sunri\\Desktop\\read1.txt");
		
		// 읽기용 파일
		Path input = Paths.get("C:\\Users\\\\sunri\\Desktop\\read.txt");

		// 쓰기용 파일
		Path output = Paths.get("C:\\Users\\\\sunri\\Desktop\\read1.txt");

		// 읽기용 파일의 내용을 BufferedReader로 가져온다 쓰기용 파일에 출력한다
		
		try(BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
			BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {
			// 읽기용 파일을 한줄씩 읽고 빈 줄이 없는 경우 쓰기용 파일에 기록한다
			for(String line = reader.readLine(); line != null; line = reader.readLine()) {
				System.out.println(line);
				
				// output 파일에 쓸겨 (output 파일에 내용이 있으면 다 지워지고 input 파일에 있는 내용이 새로 덮어씌워진다)
				writer.write(line);
				writer.newLine();
			}

			// 트라이에 조건으로 넣어놔서 reader, writer는 close안해줘도됨. try 종료 후 자동 종료됨
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}


//1. FileWriter 클래스를 이용해서 파일 쓰기 
//2. BufferedWriter 클래스를 이용해서 파일 쓰기
//3. Files 클래스를 이용해서 파일 쓰기 ★

//	isWritable(path) 파일에 쓸 수 있는지 판정
//	newBufferedWriter(path, cs, options...) 버퍼드라이터를 생성
//	write(path, lines, cs, options...) 텍스트를 파일에 기록

