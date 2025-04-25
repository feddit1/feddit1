package chapter03.swichtest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example_02 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요. 
		 * (월요일:떡볶이,화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */
		//int day;
		//day =(int)(Math.random()*7)+1; //캐스팅,명시적 형변환 
		
		
		
		//Scanner scan = new Scanner(System.in);
		//String str;
		//str = scan.nextLine();
		
		String str = JOptionPane.showInputDialog("요일");
		String cooking;
		//day = Integer.parseInt(JOptionPane.showInputDialog("입력"));
		
		switch (str) {
		case "월":  
			cooking = "1";
			System.out.println("가");
			break;
		case "화":
			cooking = "2";
			System.out.println("나");
			break;
		case "수":
			cooking = "3";
			System.out.println("다");
			break;
		case "목":
			cooking = "4";
			System.out.println("라");
			break;
		case "금":
			cooking = "5";
			System.out.println("마");
			break;
		case "토":
			cooking = "6";
			System.out.println("바");
			break;
		case "일":
			cooking = "7";
			System.out.println("사");
			break;
			
		default:
			cooking = "x";
			System.out.println("잘못 입력함.");
			break;
		}
		
		JOptionPane.showMessageDialog(null, cooking + "입니다.");
		
	}

}
