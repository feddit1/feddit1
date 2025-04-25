package chapter03.fortest;

import java.util.Scanner;

public class ForExamo1e01 {

	public static void main(String[] args) {
		
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받고,
				// 총점과 평균을 구하시오.(단, 평균은 실수로 출력할 것)
		
		Scanner  scan = new Scanner(System.in);
		
		int i, sum = 0 , cnt=0,score;
		double avg = 0;
		
		System.out.println("몇 명");
		cnt = scan.nextInt();
		
		for(i=1;i<=cnt;i++)
		{
			System.out.print(i+"번째 성적 입력 :");
			score = scan.nextInt();
			sum += score;
		}
		avg = (double) sum/cnt;
		System.out.println(cnt + "명의 점수 총점은"+sum+"점 , 평균은"+avg+"");
	}

}
