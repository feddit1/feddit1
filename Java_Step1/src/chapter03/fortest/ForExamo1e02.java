package chapter03.fortest;

public class ForExamo1e02 {

	public static void main(String[] args) {
		//홀수 구구단 만들기
		
		for (int i=1; i<=9; i+=2)
		{
			System.out.println(i+"단");
			for(int j=1; j<10; j++)
			{
				System.out.println(i+" X "+j + "=" +(i*j));
			}//in for
			System.out.println();
		}//out for
	}

}
