package chapter03.ifTest;

import javax.swing.JOptionPane;

public class IfTest_07 {

	public static void main(String[] args) {
		// 데이터셋
		String ID = "KIMMIHO";
		int PW = 7369;
		
		//고객
		String id = JOptionPane.showInputDialog("아이디");
		
		if(ID.equals(id))
		{
			int pw = Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
			if(PW==pw){
				System.out.println(ID+"님 환영합니다.");
			}else {
					System.out.println(id+"와 일치하는 비밀번호가 없습니다");
			}
			
		}
		else {
			System.out.println("일치하는아이디가 없습니다");
		}
	}
	

}
