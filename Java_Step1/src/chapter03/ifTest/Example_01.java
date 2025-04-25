package chapter03.ifTest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example_01 {

	public static void main(String[] args) {
		// wizard라는 이름과 일치하면 문이 열리고 
		// 문이 열린후 퀴즈의 답은 fire다 퀴즈까지 맞히면 "정답입니다 동굴의 문이 열립니다."
		// 이름이 일치하지 않으면 "이름이 틀렸습니다. 접근이 거부됩니다"
		// 이름은 일치하였으나 퀴즈의 답이 틀리면 "틀렸습니다. 도망치세요"
		String correctName = "wiz";
		String correctAnswer = "fi";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==동굴==");
		System.out.print("당신의 이름을 입력하세요 : ");
		//nextLine() : 한 줄 전체 문자열 입력(공백포함)
		//next(): 문자 단어 하나(공백에서 끊김) 
		String myname = scan.nextLine(); //한 줄 전체 입력
		//" \n[문지기] 
		
		//equalsIgnoreCase : ,대소문자 구분 없이 비교
		if(correctName.equalsIgnoreCase(myname))
		{
			System.out.print("정답을 입력하세요 : ");
			String answer = scan.nextLine();
			
			if(correctAnswer.equalsIgnoreCase(answer))
			{
				System.out.println("정답");
			}
			else 
			{
				System.out.println("틀림");
			}
		}
		else
		{
			System.out.println("이름틀림");
		}
		
		
		
				
		String str = "1";
		String q = "2";
				
		String name = JOptionPane.showInputDialog("이름");
		String Pq = JOptionPane.showInputDialog("답변");
		
		
		if(str.equals(name))
		{
			if(q.equals(Pq))
			{
				System.out.println("정답입니다 동굴의 문이 열립니다.");
				
			}
			else
			{
				System.out.println("틀렸습니다. 도망치세요");
			}
			
		}
		else
		{
			System.out.println("이름이 틀렸습니다. 접근이 거부됩니다");
			
		}
	}

}
