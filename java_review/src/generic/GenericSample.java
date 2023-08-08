package generic;
// * 타입세이프

public class GenericSample<T> {
		private T object;
		
		// 게터, 세터
		public T getOjbect() {
			return object;
		}

		public void setObject(T object) {
			this.object = object;
		}
}

