package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘
		/*
		 5! > 5x4x3x2x1  > n! > n*(n-1)
		  
		  
		 */
		
		int number = 5;
		int factorial = 1; //누적변수이므로 초기화 ,곱에 대한 누적변수는 1로 초기화
		
		while(number > 0) {
			//factorial=factorial*number;
			factorial*=number;
			number --;
		}
		System.out.println("팩토리얼 결과:" + factorial);
	}//m

}//c
