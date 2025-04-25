package chapter03.ifTest;

import java.util.Scanner;

public class IfTest_01 {

	public static void main(String[] args) {
		/*
		//1.삼항연산자
		Scanner scan =new Scanner(System.in);
		System.out.println("나이는?:" );
		int age = scan.nextInt();
		
		String str = age >=8 ? "학교에 다님": "학교에 다니지 않음";
		System.out.println(str);
		*/
		
		//2.단일 if문
		Scanner scan =new Scanner(System.in);
		System.out.println("나이는?:" );
		int age = scan.nextInt();
		
		if(age>=8) 
		{
			System.out.println("학교에 다님");
			
		}
		//System.out.println("학교에 다니지 않음");
		
		
		//3.if else
		int age2 = 10;
		if(age>=8) 
		{
			System.out.println("학교에 다님");
		}
		else
		{
			System.out.println("학교에 다니지 않음");
		}
		
		
		
		
		
			

	}

}
