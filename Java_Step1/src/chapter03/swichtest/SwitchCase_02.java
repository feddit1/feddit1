package chapter03.swichtest;

import javax.swing.JOptionPane;

public class SwitchCase_02 {

	public static void main(String[] args) {

		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("1~4사이의 번호"));

		System.out.println("========Switch===============");
		switch (num) {
		case 1:
			System.out.println("1조회를 선택");
			break;

		case 2:
			System.out.println("2조회를 선택");
			break;

		case 3:
			System.out.println("3조회를 선택");
			break;

		case 4:
			System.out.println("4조회를 선택");
			break;

		default:
			System.out.println("잘못입력");
		}// switch

		/*
		System.out.println("========Switch Expression===============");

		String message = switch (num) {
		case 1 -> "1선택.";
		case 2 -> "2선택.";
		case 3 -> "3선택.";
		case 4 -> "4선택.";
		default  -> "잘못입력.";
		};
		System.out.println(message);
        */
		
	}// main

}// class
