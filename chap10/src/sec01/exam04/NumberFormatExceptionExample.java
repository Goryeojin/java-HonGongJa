package sec01.exam04;

public class NumberFormatExceptionExample {
	
	// NumberFormatException ���� ���ܸ� �˾ƺ���.
	
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);		// NumberFormatException �߻�
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
		
		/*
		Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
			at java.base/java.lang.Integer.parseInt(Integer.java:652)
			at java.base/java.lang.Integer.parseInt(Integer.java:770)
			at chap10/sec01.exam04.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:13)
		*/
	}

}
