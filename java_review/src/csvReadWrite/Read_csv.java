package csvReadWrite;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Read_csv {

	public static void main(String[] args) {
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
	}
}

// 참고 유튜브: https://youtu.be/jLDZVrPsyWw

//	csv 파일 읽기 (readCsvFile.csv) => 데이터가 , 콤마 단위로 구분되기때문에 구분해줘야한다.
//	csv 파일이 필요하다(읽어올거야)