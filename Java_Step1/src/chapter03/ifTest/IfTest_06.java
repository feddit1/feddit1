package chapter03.ifTest;


import javax.swing.JOptionPane;

public class IfTest_06 {

	public static void main(String[] args) {
		// 두 수를 입력받아 어떤 수가 큰지 판단하는 프로그램
		// num1, num2 의 수가 num1이 큽니다. 또는 num2가 큽니다.또는 같습니다 의 결과가 나오도록
		// 그 외 입력 시 다시 입력하세요 로 출력
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("첫 번째 숫자"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("두 번째 숫자"));
		
	//?
		if(num1>num2)
		{
			System.out.println("num1이 큽니다");
		}
		else if (num1<num2)
		{
			System.out.println("num2이 큽니다");
		}
		else 
		{
			System.out.println("두 수가 같습니다");
		}
	
	}

}
