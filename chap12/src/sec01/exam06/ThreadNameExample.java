package sec01.exam06;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread(); // �� �ڵ带 �����ϴ� ������ ��ü ���
		System.out.println("���α׷� ���� ������ �̸� : " + thread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();
		
	}

}
