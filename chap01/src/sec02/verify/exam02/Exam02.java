package sec02.verify.exam02;

public class Exam02 {	// for���� �̿��� 1-100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��غ���.
	
	public static void main(String[] args) {
		
		
		int sum = 0;	// �հ� ����
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {	// i�� 3�� ����� ��� ���ǹ� ���� ����
				sum += i;	// 3�� ��� �� ���ϱ�
			}
		}
		
		System.out.println("3�� ����� �� : " + sum);
	}
}
