package chapter02;

import java.util.Scanner;

public class Example_06 {

	public static void main(String[] args) {
		/*Scanner 을 사용하여 
		두 개의 불리언(boolean) 변수 isSunny와 isWarm을 입력받아, 
		날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
		(날씨가 화창하면서 따뜻한지에 대한 변수 isNiceWeather 으로 작성하세요.)*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("날씨는? : ");
		boolean isSunny = scan.nextBoolean();
		
		System.out.print("온도는? : ");
		boolean iswarm = scan.nextBoolean(); //true false 만 받아들임
		
		//판단(논리연산)
		boolean isNiceWeather = isSunny && iswarm;
		System.out.println("날씨가 화창하면서 따뜻한가요? :"+isNiceWeather);
		
		
	}

}
