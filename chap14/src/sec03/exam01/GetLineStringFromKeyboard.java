package sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("입력하세요 : ");
			String lineStr = br.readLine();
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.print("입력된 내용 : " + lineStr);
			System.out.println();
		}
		br.close();
		
	}

}
