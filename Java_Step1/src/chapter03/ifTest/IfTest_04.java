package chapter03.ifTest;

import javax.swing.JOptionPane;

public class IfTest_04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		
		int age;
		int charge;
		
		age = Integer.parseInt(JOptionPane.showInputDialog("나이입력"));
		
		if(age>19)
		{
			System.out.println("성인입니다");
			charge = 5000;
		}
		else if(age>13)
		{
			System.out.println("중,고딩입니다");
			charge = 3500;
		}
		else if (age>7)
		{
			System.out.println("초딩입니다");
			charge = 2000;
		}else
		{
			System.out.println("미취학 아동입니다");
		    charge = 1000;
		}
		System.out.println("입장료 :"+charge +"원");
	}
}
