package sec02.verify.exam02;

public class Exam03 {
	
	public static void main(String[] args) {
		
		// while���� Math.random() �޼ҵ带 �̿��ؼ� 2���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�,
		// ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����.
		// ���� ���� 5�� �Ǵ� ������ (1, 4), (4, 1), (2, 3), (3, 2)
		
		while(true) {
			
			int var1 = (int)(Math.random() * 6) + 1;
			int var2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("(" + var1 + ", " + var2 + ")");
			
			if(var1 + var2 == 5) {
				break;
			}
		}
	}

}
