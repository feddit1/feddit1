package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// 학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고
		// 총점과 평균을 분석하는 프로젝트

		boolean run = true;

		int studentNum = 0;
		int[] score = null; // score = new int[strudentNum]

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수 입력");
				studentNum = Integer.parseInt(sc.nextLine());
				// System.out.println("학생수는 : "+ studentNum);
				score = new int[studentNum]; // 배열의 첨자 정의 = 메모리 확보

			} else if (selectNo == 2) {

				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + (i + 1) + "]");
					score[i] = Integer.parseInt(sc.nextLine());// score배열방에 요소 추가
				} // for

			} else if (selectNo == 3) {
				System.out.println("점수리스트");
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + (i + 1) + "]" + score[i]);

				} // for
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;

				for (int i = 0; i < score.length; i++) {
					max = max < score[i] ? score[i] : max;
					/*
					 * if(max<score[i]) { max=score[i]; }
					 */
					sum += score[i]; // 총점

				} // for

				avg = sum / (double)studentNum;
				System.out.println("총점:" + sum);
				System.out.println("평균:" + avg);
				System.out.println("최고점:" + max);

			} else if (selectNo == 5) {
				System.out.println("종료");
				run = false;
			} else
				System.out.println("잘못입력함");

		} // while

		System.out.println("프로그램 종료");
	}// m

}// c
