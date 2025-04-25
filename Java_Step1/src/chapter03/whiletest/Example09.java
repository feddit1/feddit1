package chapter03.whiletest;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 컴퓨터가 선택한 서로 다른 3자리 수
		int n1, n2, n3;

		do {
			n1 = (int) (Math.random() * 9) + 1;
			n2 = (int) (Math.random() * 9) + 1;
			n3 = (int) (Math.random() * 9) + 1;

		} while (n1 == n2 || n2 == n3 || n1 == n3);

		int tryCount = 0;

		System.out.println("숫자 야구게임 시작(1~9 서로 다른 숫자 3개)");

		while (true) {
			tryCount++;
			System.out.println("입력 (공백으로 구분)");
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int u3 = sc.nextInt();

			int strike = 0;
			int ball = 0;

			// strike > u1==n1 u2==n2 u3==n3
			// ball > n1==u2u3

			if (n1 == u1)
				strike++;
			else if (n1 == u2 || n1 == u3)
				ball++;

			if (n2 == u2)
				strike++;
			else if (n2 == u1 || n2 == u3)
				ball++;

			if (n3 == u3)
				strike++;
			else if (n3 == u1 || n3 == u2)
				ball++;

			if (strike == 3) {
				System.out.println("클리어");
				System.out.println("총 시도 횟수 : " + tryCount);
			} else {
				System.out.println(strike + "스트라이크 갯수" + ball + "볼 갯수");
			}
		}

	}

}
