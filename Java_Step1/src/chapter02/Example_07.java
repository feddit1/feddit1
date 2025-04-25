package chapter02;

import java.util.Scanner;

public class Example_07 {

	public static void main(String[] args) {
		
		// 한 자릿수 숫자를 입력받아 (scan)
				// 숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)

		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력 :" );
		int num = scan.nextInt();
		
		String result;
		result = (num%2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
				
		
		//
		int remainder = num%2;
		boolean isOdd = remainder ==1;
		
		String result4 = isOdd ? "홀":"짝";
		System.out.println(result4);
		//
		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
				// 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("1번째 숫자 : ");
		int num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("2번째 숫자 : ");
		int num2 = scan2.nextInt();
		
		String result2;
		result2 = num1 > num2 ? "첫 번째 숫자가 큼":"두 번째 숫자가 큼" ;
		System.out.println(result2);
		
		
		//
		boolean isGreater = num1 > num2; // true or false
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요? : "+ isGreater);
		System.out.println();
		
		String greater = isGreater ? "": " ";
		System.out.println(greater);
		//
		
	}

}
