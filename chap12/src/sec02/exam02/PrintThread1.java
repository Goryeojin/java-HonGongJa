package sec02.exam02;

public class PrintThread1 extends Thread {
	
	// while���� ���� boolean stop ���� ����
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		// while�� ���� �ݺ�
		while(!stop) { // 
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
