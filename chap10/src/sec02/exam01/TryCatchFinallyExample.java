package sec02.exam01;

public class TryCatchFinallyExample {
	
	// try-catch-finally ���
	
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2"); // �Ű������� �־��� Ŭ������ �����ϸ� Class ��ü ����
			// �������� ������ ClassNotFoundException �߻�
			// �Ϲ� �����̹Ƿ� �����Ϸ��� ���� ó�� �ڵ带 �䱸��
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}	
	}

}
