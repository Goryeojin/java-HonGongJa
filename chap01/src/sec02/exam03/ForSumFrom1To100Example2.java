package sec02.exam03;

public class ForSumFrom1To100Example2 {
	
	public static void main(String[] args) {
		
		
		int sum = 0;	// 합계 변수
		
		int i = 0;		// 루프 카운터 변수 미리 선언
		for(i=1; i<=100; i++) {	// i가 1에서 100까지 총 100번 실행
			sum += i;
		}
		
		System.out.println("1 ~ " + (i-1) + "의 합 : " + sum);
	}

}
