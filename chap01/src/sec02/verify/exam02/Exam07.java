package sec02.verify.exam02;

import java.util.Scanner;

public class Exam07 {
	
	public static void main(String[] args) {
		
		// while문과 Scanner를 이용해 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------");
			System.out.print("선택 > ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
			case 1:
				System.out.print("예금액 > ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
