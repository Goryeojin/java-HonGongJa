package sec02.verify.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		System.out.println(sdf.format(new Date()));
	}

}
