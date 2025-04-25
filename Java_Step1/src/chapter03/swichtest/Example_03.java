package chapter03.swichtest;

import javax.swing.JOptionPane;

public class Example_03 {

	public static void main(String[] args) {
		
		
		//input.isEmpty();
		
		//NULL (아무것도 입력안된 상황)  -> String str = null
		// isEmpty(문자길이가 0) -> String str = "";
		
		//if 문으로 input == null이거나 input.isEmpty() 면 메세지 박스를 이용하여 입력값이 없습니다.
		
		//A B C D E F 

		String input = JOptionPane.showInputDialog("등급을 입력하세요 (A~F) : ");
		
		
		if(input==null||input.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "입력값이 없습니다.");
			//System.out.println("입력값이 없습니다");
		}
		
		char grade = Character.toUpperCase(input.charAt(0)); //뭐든 대문자로 변환
		String message;
		
			switch (grade) {
			case 'A': // ?? '' 랑 "" 차이
				message = "1등급";
				break;
			case 'B':
				message = "2등급";
				break;
			case 'C':
				message = "3등급";
				break;
			case 'D':
				message = "4등급";
				break;
			case 'E':
				message = "5등급";
				break;
			case 'F':
				message = "6등급";
				break;
			default:
				message = "미등록";
				break;
			}
			
			JOptionPane.showMessageDialog(null, "당신의 등급은" + grade + "\n코멘트 입니다.");
		
		
		
		//switch 사용 
		
		;//messageDialog 출력 
	}

}
