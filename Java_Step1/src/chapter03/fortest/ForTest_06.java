package chapter03.fortest;

public class ForTest_06 {

	public static void main(String[] args) {
		//1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요

		
		int total =0; 
		
		for (int a=1;a<=100;a++)
		{
			if(a%3 == 0)
			{
				System.out.print(a+" ");
				total += a;
				
			}
			
		}
		System.out.println();
		System.out.println("0~100까지의 수중 3의 배수의 합 : "+ total);
	}

}
