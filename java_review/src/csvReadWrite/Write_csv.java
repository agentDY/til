package csvReadWrite;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Write_csv {
	public static void main(String args[]) {
		// 출력 스트림 생성
		BufferedWriter bw = null;
		
		try {
			bw = Files.newBufferedWriter(Paths.get("C:\\Users\\sunri\\Desktop\\output.csv"), Charset.forName("UTF-8"));
			
			// csv 파일을 읽어들일 리스트 생성
			List<List<String>> allData = readCSV();

			for(List<String> newLine : allData){
				// 1행분의 데이터를 가져오기
				List<String> list = newLine;
				
				for(String data: list){
					bw.write(data);
					bw.write(",");
				}

				// 추가할 주소 데이터 추가
				bw.write("주소");
				
				// 개행 코드 추가
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) bw.close();
			} catch(IOException e) { e.printStackTrace(); }
		}
	}
	
	static List<List<String>> readCSV() {
		// 반환용 리스트
		List<List<String>> ret = new ArrayList<>();

		// 입력스트림 생성
		BufferedReader br = null;

		try{
			// csv 경로설정
			br = Files.newBufferedReader(Paths.get("C:\\Users\\sunri\\Desktop\\readCsvFile.csv"), Charset.forName("UTF-8"));
			
			// csv 파일에서 읽어들인 1행분의 데이터
			String line = "";

			while((line = br.readLine()) != null){
				// csv 파일의 1행을 저장하는 리스트 설정
				List<String> tmpList = new ArrayList<>(); // 2차원 배열형식
				String array[]= line.split(",");
				
				// 배열에서 리스트로 변환
				tmpList = Arrays.asList(array);
				
				// 리스트 내용을 출력
				System.out.println(tmpList);

				// 반환된 리스트 1행의 데이터를 저장
				ret.add(tmpList);
			}		
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}
	
}


// 참고 유튜브: https://youtu.be/sFMT5E0eBrw

//	csv 파일 쓰기
//	BufferedWriter 클래스로 csv 파일에 데이터 기록 가능
//	File, FileWriter를 랩해서 쓰는 것은 일반적으로 write 하는 것과 동일



