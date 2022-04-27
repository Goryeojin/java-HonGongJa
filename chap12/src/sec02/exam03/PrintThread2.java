package sec02.exam03;

public class PrintThread2 extends Thread {
	
	public void run() {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		// �����带 �Ͻ��������� while�� ����������
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			// while�� ��������.
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
		
		// interrupted() �޼ҵ� ����ϱ�
		/*
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
		*/
	}

}
