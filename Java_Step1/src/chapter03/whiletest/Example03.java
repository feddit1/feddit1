package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //예금(+) 출금(-)
		
		Scanner scan = new Scanner(System.in);
		
		//1.예금 2.출금 3 잔고 4 종료
		while(run) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum =  scan.nextInt();
			
			//선택한 값으로 은행업무 수행
			switch (menuNum) {
			case 1:
				System.out.println("예금액> ");
				int inmoney = scan.nextInt();
				balance +=inmoney;
				break;
			case 2:
				System.out.println("출금액> ");
				int outmoney = scan.nextInt();
				balance -=outmoney;
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(balance);
				
				break;
			case 4:
				run = false;
				break;
				
			}//switch
			System.out.println();
		}//while
		System.out.println("종료");
	}//m

}//c
