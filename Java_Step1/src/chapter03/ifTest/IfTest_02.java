package chapter03.ifTest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfTest_02 {

	public static void main(String[] args) {
		// 10의 배수를 판단
		// 조건: data에 있는 값을 10으로 나눈 나머지가 0이면  배수
		
		int data;
		// Integer.parseInt(); : 문자열을 정수로 변환
		data = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요")); //전부 다 문자열
		
		System.out.println(data);
				
		
		
		

	}

}
