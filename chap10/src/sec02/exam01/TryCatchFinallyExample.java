package sec02.exam01;

public class TryCatchFinallyExample {
	
	// try-catch-finally 블록
	
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2"); // 매개값으로 주어진 클래스가 존재하면 Class 객체 리턴
			// 존재하지 않으면 ClassNotFoundException 발생
			// 일반 예외이므로 컴파일러가 예외 처리 코드를 요구함
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}	
	}

}
