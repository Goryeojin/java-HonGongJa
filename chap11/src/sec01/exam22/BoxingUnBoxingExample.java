package sec01.exam22;

public class BoxingUnBoxingExample {
	
	// 기본 타입의 값을 박싱하고 언박싱하기
	public static void main(String[] args) {
		
		// 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf("300");
		
		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);	// 100
		System.out.println(value2); // 200
		System.out.println(value3); // 300
		
		String str1 = "gd";
		String str2 = "gd";
		
	}
}
