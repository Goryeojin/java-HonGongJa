package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100];
		while(true) {
			int readByteNum = is.read(buffer);	// 배열 길이만큼 읽기
			if(readByteNum == -1) break;
			for(int i=0; i<readByteNum; i++) {	// 읽은 바이트 수만큼 반복하며
				System.out.println(buffer[i]);	// 배열에 저장된 바이트 출력
			}
		}
		is.close();
	}

}
