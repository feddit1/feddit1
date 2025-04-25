package chapter03.fortest;

public class ForTest_04 {

	public static void main(String[] args) {
		
		System.out.println("===0부터 100까지의 수중 홀수의 합을 출력======");
		
		
		int num;
		int total=0;
		
		for (num=1;num<=100;num++)
		{
			if(num%2 == 0)
			{
				continue;//무시(그냥 지나가세요)
			}
			System.out.print(num+" ");
			total += num;
		}
		System.out.println();
		System.out.println("0~100까지의 수중 홀수의 합 : "+ total);
		

		
        int total2=0;
		for (int i=1;i<=100;i++)
		{
			if(i%2 == 1)
			{
				System.out.print(i+" ");
				total2 += i;
			}
			
		}
		System.out.println();
		System.out.println("0~100까지의 수중 홀수의 합 : "+ total2);
		System.out.println();
		
		//#3
		int hap=0;
		
		for (int k=1; k<100; num+=2)
		{
			hap+=k;
		}
		System.out.println("0~100까지의 수중 홀수의 합 : "+ total2);
	}

}
