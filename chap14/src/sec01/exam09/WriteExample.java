package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		// 배열의 1번 인덱스부터 3개를 출력
		writer.write(array, 1, 3);
		
		// 'B', 'C', 'D'가 저장된다.
		writer.flush();
		writer.close();
		
	}

}
