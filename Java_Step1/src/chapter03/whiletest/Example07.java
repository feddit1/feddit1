package chapter03.whiletest;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Example07 {

	public static void main(String[] args) {
		// 숫자 암호(3자리)100~999 해제
		/*
		 * 1.컴퓨터가 100~999 사이의 무작위 암호를 설정 2.사용자가 맞출때까지 입력 3.틀릴 경우 틀렸습니다 다시 입력하세요 4.맞추면 성공
		 * 암호해제 5.몇번만에 맞췄는지 출력
		 */

		Scanner scan = new Scanner(System.in);
		int password = (int) (Math.random() * 900)+100;
		int userinput;
		int count = 0;

		System.out.println("3자리 숫자 맞추기");

		do {

			System.out.println("암호 입력 : ");
			                 System.out.println(password);
			userinput = scan.nextInt();
			count++;
			if (userinput < password) {
				System.out.println("up");
			} else if (userinput > password) {
				System.out.println("down");
			}

		} while (password != userinput);

		System.out.println("성공, 해제");
		System.out.println("시도횟수" + count + "회");

	}

}
