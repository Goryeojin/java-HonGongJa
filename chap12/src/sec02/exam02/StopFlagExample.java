package sec02.exam02;

public class StopFlagExample {
	public static void main(String[] args) {
		
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		// ���� ������ 1�� ����
		try { Thread.sleep(1000); } catch(InterruptedException e) {}
		
		// printThread�� stop �ʵ� ����
		printThread.setStop(true);
	}

}
