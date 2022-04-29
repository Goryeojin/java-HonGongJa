package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100];
		while(true) {
			int readByteNum = is.read(buffer);	// �迭 ���̸�ŭ �б�
			if(readByteNum == -1) break;
			for(int i=0; i<readByteNum; i++) {	// ���� ����Ʈ ����ŭ �ݺ��ϸ�
				System.out.println(buffer[i]);	// �迭�� ����� ����Ʈ ���
			}
		}
		is.close();
	}

}
