package chapter03.whiletest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example01 {

	public static void main(String[] args) {
		/*
		 * 사용자가 "no"를 입력하기 전까지 계속해서 메시지를 입력받고, 출력하는 프로그램을 만들어보세요. (do-while사용)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		System.out.println("종료시 no입력");

		String inputString;

		do {
			System.out.println("> ");
			inputString = scan.nextLine();
			System.out.println(inputString);

		} while (!inputString.equals("no")); // no 입력하면 실행 멈춤
		System.out.println();
		System.out.println("실행종료");

	}// m

}// c
