package sec02.verify.exam02;

public class Exam05 {
	
	public static void main(String[] args) {
		
		/*
			???? ????
			*
			**
			***
			****
		 */
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				
				System.out.print("*");
				
				if(j==i) {
					System.out.println();
				}
				
			}
		}
	}

}
