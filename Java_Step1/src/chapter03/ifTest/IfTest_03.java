package chapter03.ifTest;

import javax.swing.JOptionPane;

public class IfTest_03 {

	public static void main(String[] args) {
		
		
		
		char grade;
		int jumsu;
		
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("자바 점수"));
		//#1 
		/*if(jumsu>=90)
		{
			System.out.println('A');
		}
		else if(jumsu >= 80)
		{
			System.out.println('B');
			
		}
		else if(jumsu >= 70)
		{
			
			System.out.println('C');
		}
		else if(jumsu >= 60)
		{
			System.out.println('D');
		}
		else 
		{
			System.out.println('F');
		}*/
		
		//#2
		if(jumsu >100||jumsu <0)
		{	
			System.out.println("잘못 입력");
		}
		if(jumsu>=90)
		{
			grade='A';
			System.out.println("최우수");
		}
		else if(jumsu >= 80)
		{
			grade='B';
			System.out.println("우수");
		}
		else if(jumsu >= 70)
		{
			grade='C';
		}
		else if(jumsu >= 60)
		{
			grade='D';
		}
		else 
		{
			grade='F';
		}
		
		System.out.println("당신의 점수는 : " +grade + "입니다");
		
	}//MAIN

}
