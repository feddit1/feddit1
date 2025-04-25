package chapter02;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {
		/*
		 1. Scanner를 이용하여 값을 입력받아서 양수인지 음수인지를 판별하는 프로그램
		 2. 삼항연산자를 사용하여 변수방에 저장된 수가 양수면 "양수입니다."
		    그렇지 않으면 "음수 또는 0입니다."라고 출력이 되어야함
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력:");
		int input = scan.nextInt();
		
		String result2;
		result2 = input > 0 ? "양수입니다" : (input <0) ? "음수입니다":"0입니다";
		System.out.println(result2);
		
		//강사님 풀의
		Scanner scan3 = new Scanner(System.in);
		System.out.print("숫자입력:");
		int number = scan.nextInt();
		
		boolean ispositive = number >0;
		String result3 = ispositive ? "양수":"음수 또는 0입니다";
		System.out.println(result3);
		//
		
		
		
		/*Scanner 을 사용하여 
		두 개의 불리언(boolean) 변수 isSunny와 isWarm을 입력받아, 
		날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
		(날씨가 화창하면서 따뜻한지에 대한 변수 isNiceWeather 으로 작성하세요.)*/
		
	
		
		
		
		
		 
		
		
	}

}
