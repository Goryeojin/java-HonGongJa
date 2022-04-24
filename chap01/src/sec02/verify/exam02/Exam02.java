package sec02.verify.exam02;

public class Exam02 {	// for문을 이용해 1-100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보자.
	
	public static void main(String[] args) {
		
		
		int sum = 0;	// 합계 변수
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {	// i가 3의 배수일 경우 조건문 내부 실행
				sum += i;	// 3의 배수 합 구하기
			}
		}
		
		System.out.println("3의 배수의 합 : " + sum);
	}
}
