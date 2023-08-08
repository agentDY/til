package fileRead;

import java.io.*;

public class BufferedReader_sample2 {
	
	public static void main(String args[]) {
		File file = new File("C:\\Users\\sunri\\Desktop\\read.txt");
	
		try(FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader)) {
		
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			// 입력 스트림을 닫아준다
			br.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	
	}
}

//	readLine() : 한 줄씩 체크한다 (행의 마지막문자=개행)은 포함하지않음 , while로 처리해주어야된다
//	반환값이 null 이 아닌 경우 조건식의 값은 true가 되어 다음 행이 존재한다고 판정함
//	lines() 
