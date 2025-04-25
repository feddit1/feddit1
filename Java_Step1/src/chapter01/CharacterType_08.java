package chapter01;

public class CharacterType_08 {

	public static void main(String[] args) {
		// Character(문자) Type
		// Java,C# > 2byte(16bit) > UTF-16
		// C , C++ > 1byte(8bit) > UTF-8

		
		char ch1 = '한';//직접 한글 입력
		char ch2 = '\uD55C'; //유니코드로 표현한 '한'글자
		
		System.out.println("ch1:" + ch1);
		System.out.println("ch2:" + ch2);
		
		char str1 = 'A'; //단일 문자 
		
		System.out.println("str1:"+str1);
		
		String str2= "Hello Java"; //참조형 
		System.out.println("str2:"+str2);
		
		String str3 = "w";//1글자만 string
		System.out.println("str3:"+str3);
		
		//정수 int 큰 수는 long 
		//실수 Double 
		//문자,열 string
		
	}

}
