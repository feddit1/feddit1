package chapter03.swichtest;

import java.util.Scanner;

public class SwitchCase_04 {

	public static void main(String[] args) {
		// A ,a 최우수 고객
		// B ,b 우수 고객
		// 나머지 일반 고객

		Scanner scan = new Scanner(System.in);

		// charAt(0) : string -> char
		System.out.print("고객 등급을 입력하세요 a.A.b.B");
		char grade = scan.nextLine().charAt(0);

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("최우수 고객");
			break;
		case 'B':
		case 'b':
			System.out.println("우수 고객");
			break;
		default:
			
		}

		// scan.nextLine().charAt(0); // 0번방 한 글자만 받는다

	}

}
