package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	// ArrayIndexOutOfBoundsException ���� ���ܸ� �˾ƺ���.
	
	public static void main(String[] args) {
		
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		
		/* Console
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		at chap10/sec01.exam02.ArrayIndexOutOfBoundsExceptionExample.main(ArrayIndexOutOfBoundsExceptionExample.java:9)
		*/
	}

}
