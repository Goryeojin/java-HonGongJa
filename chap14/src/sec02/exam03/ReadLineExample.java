package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		
//		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
//		BufferedReader br = new BufferedReader(reader);
		
		BufferedReader br = new BufferedReader(new FileReader(ReadLineExample.class.getResource("language.txt").getPath()));
		
		String data;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		
		br.close();
	}

}
