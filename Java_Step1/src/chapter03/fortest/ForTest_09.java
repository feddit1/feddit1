package chapter03.fortest;

public class ForTest_09 {

	public static void main(String[] args) {
		System.out.println("▶ 역삼각형 별 출력");
		
		for(int i=5; i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}//in for
			System.out.println();//줄바꿈
		}//for

	}//m

}//c
