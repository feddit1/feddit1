package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest_05 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("자바 교과목 점수를 입력하세요 : ");
			int scr = scan.nextInt();
			
			if(scr<0 || scr>100)
			{
				System.out.println("0~100까지의 점수만 입력 가능합니다");
			}
			else
			{
				if(scr>=60)
				{
					System.out.println("합격");
				}
				else
					System.out.println("불합격");
			}
			System.out.println("종료");
			break;
			
			/*if(scr<0 || scr>100)
			{
				System.out.println("0~100까지의 점수만 입력 가능합니다");
			}
			else if(scr >=60)
			{
				합격
				break;
			}
			else
			{
				불합격
				break;
			}
			
			*/
		}
		//if -> 60점 이상이면 합격 그밖에 불합격
		// 0이하 100초과시 "0~100까지의 점수만 입력 가능합니다."
		// OR -> ||	

	}

}
