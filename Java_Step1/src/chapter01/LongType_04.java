package chapter01;

public class LongType_04 {

	public static void main(String[] args) {
		// Long Type
		//int num1 =12345678900; //int > 32bit(x)
		long num2 =12345678900L; //long > 64bit(0)
		long num3 =1000; //자동 형변환이 된다 
		//long 형의 64비트 자료지만 l이 선언되어 있지 않으면 int로 자동 형변환
		
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num2+num3); // 더 큰 범위의 long으로 자동형변환
		
		
		//--------------------------------
		int level; //선언만 하고 초기화 하지 않음
		level=10; // 리터널 값
		
		System.out.println(level);
		

	}

}
