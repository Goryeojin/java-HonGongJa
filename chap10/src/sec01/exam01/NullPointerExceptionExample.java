package sec01.exam01;

public class NullPointerExceptionExample {
	
	// NullPointerException 실행 예외를 알아보자.
	
	public static void main(String[] args) {
		
		String data = null;		// 참조 변수가 null을 가리킴
		System.out.println(data.toString());	// 객체 참조가 없는 상태에서 객체를 사용하려함.
		
		/* Console
		 * 
		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
		at chap10/sec01.exam01.NullPointerExceptionExample.main(NullPointerExceptionExample.java:10)
		*/
	}

}
