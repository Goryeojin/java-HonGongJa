package sec01.exam01;

public class NullPointerExceptionExample {
	
	// NullPointerException ���� ���ܸ� �˾ƺ���.
	
	public static void main(String[] args) {
		
		String data = null;		// ���� ������ null�� ����Ŵ
		System.out.println(data.toString());	// ��ü ������ ���� ���¿��� ��ü�� ����Ϸ���.
		
		/* Console
		 * 
		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
		at chap10/sec01.exam01.NullPointerExceptionExample.main(NullPointerExceptionExample.java:10)
		*/
	}

}
