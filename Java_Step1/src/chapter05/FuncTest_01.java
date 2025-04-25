package chapter05;

import javax.swing.JOptionPane;

public class FuncTest_01 {
	
	//메서드
	//int num1 , int num2 > 매개변수

	public static void sum(int num1 , int num2)
	{
		int sum = num1+ num2;
		System.out.println("두 수의 합: " + sum);
	}
	
	
	public static void main(String[] args) {
			
		int a,b;
		
		
		a=Integer.parseInt(JOptionPane.showInputDialog("값1")); 
		b=Integer.parseInt(JOptionPane.showInputDialog("값2")); 
		
		/*
		System.out.println("두 수의 합: " + sum);
		*/
		
		sum(a , b); //갯수랑 타입이 같아야함

	}

}
