package chapter07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {

		// 일산점 031-1234-5678 이자율 5.3f
		// 종로점 02-852-9856

		String point = JOptionPane.showInputDialog("저점명");
		String tel = JOptionPane.showInputDialog("전화번호");

		Bank_02 bk = new Bank_02(point, tel);

		Scanner scan = new Scanner(System.in);
		System.out.print(point + "지점의 퇴직연금의 이자를 입력하세요: ");
		bk.interest = scan.nextFloat();
		bk.getBank();

	}

}
