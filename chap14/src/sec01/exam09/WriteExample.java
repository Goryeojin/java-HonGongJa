package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		// �迭�� 1�� �ε������� 3���� ���
		writer.write(array, 1, 3);
		
		// 'B', 'C', 'D'�� ����ȴ�.
		writer.flush();
		writer.close();
		
	}

}
