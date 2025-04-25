package chapter03.swichtest;

import java.util.Scanner;

public class SwitchCase_03 {

	public static void main(String[] args) {

		int month;
		int day;

		Scanner scan = new Scanner(System.in);

		System.out.println("월을 입력하세요 (1~12):");
		month = scan.nextInt();

		switch (month) {
		case 1: {
			day = 28;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}

		case 3: {
			day = 28;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}

		case 5: {
			day = 28;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}

		case 7: {
			day = 28;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}
		case 8: {
			day = 28;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}

		case 10: {
			day = 28;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}

		case 12: {
			day = 31;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}
		case 2: {
			day = 31;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}
		case 4: {
			day = 31;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}
		case 9: {
			day = 31;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}
		case 11: {
			day = 31;
			System.out.println(month + "월은" + day + "일 까지입니다");
			break;
		}

		default: {
			day = 0;
			System.out.println("존재하지 않는 달입니다");

		}

		}// 스위치
 
	}// 메인

}// 클래스
