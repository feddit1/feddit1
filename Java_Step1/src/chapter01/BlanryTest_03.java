
package chapter01;

public class BlanryTest_03 {

	public static void main(String[] args) {
		//자료형 : 정수(int)  
		//byte >  1byte 2의 8승 -128 ~ 127
		//short > 2바이트 2의 16승 
		//int > 4바이트 2의 32승 , 가장 일반적
		//long > 8바이트 2의 64승 , 큰 숫자가 필요할때
		
		 byte myByte = 100;
		 short myShort = 20000;
		 int myInt = 1000000000;
		 long myLong = 900000000000L;
		 
		 System.out.println("byte: "+ myByte);
		 System.out.println("short: "+ myShort);
		 System.out.println("int: "+ myInt);
		 System.out.println("long: "+ myLong);
		 
		 
		 
		 int result = myByte + myShort;
		 System.out.println("두 수의 합: "+ result);
		 System.out.println("두 수의 합: "+ (myByte + myShort));
		 
	}

}
