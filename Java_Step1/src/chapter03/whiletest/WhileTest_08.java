package chapter03.whiletest;

public class WhileTest_08 {

	public static void main(String[] args) {
		
		int num=3;
		int sum=0;
		//선수행을 하고 조건에 대입
		
		do {
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("3부터 10까지의 합: " + sum);
		

	}

}
