package generic;

public class SampleMain {

	public static void main(String[] args) {
		// 제네릭 타입을 유저가 설정할 수 있다 genericSample 클래스에서 <T>로(타입의 T) 설정함
		
		// 1. <String> 타입
		GenericSample<String> sample = new GenericSample<>();
		sample.setObject("안녕하세요!");
		System.out.println(sample.getOjbect());
		
		// 2. <Integer> 타입
		GenericSample<Integer> sample2 = new GenericSample<>();
		sample2.setObject(123);
		System.out.println(sample2.getOjbect());
	}

}
