package fileRead;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Path_sample {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\sunri\\Desktop\\read.txt");
		
		Charset cs = StandardCharsets.UTF_8;
		List<String> list = new ArrayList();
		
		try{
//			한번에 모두 읽는 방법 Files 클래스
			list = Files.readAllLines(path, cs);
		} catch(IOException e){
			e.printStackTrace();
		}

		// 가져온 텍스트 내용을 출력
		for(String readLine : list){
		System.out.println(readLine);
		}
	}
}

//	Files 클래스를 사용해서 텍스트를 한번에 읽어오는 방법
//	isReadable(path)
//	readAllBytes(path) => 2G를 넘으면 예외(out of memory error)
//	readAllLines(path, charset)
//	charset=> 생략가능, UTF-8 디폴트
//	lines(path, charset)

//	Path get(String ...) => 경로를 반환하는 Path 클래스의 메소드

