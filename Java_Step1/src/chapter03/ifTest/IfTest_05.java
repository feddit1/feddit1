package chapter03.ifTest;

import javax.swing.JOptionPane;

public class IfTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	BMI 체중KG / 신장M *2
		 	25이상 과체중
		 	18.5이상 25미만 정상
		 	18.5미만 저체중
		 * */
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("키"))/100.0;
		
		double bmi = weight /(height*2);
		
		String result;
		
		if(bmi >=25)
		{
			result = "과체중";
		}
		else if(bmi >=18.5)
		{
			result = "정상";
		}
		else
		{
			result = "저체중";
		}
		//System.out.println("키는 :" +height+" Cm.");
		//System.out.println("몸무게는 :" +weight+" Kg.");
		System.out.printf("당신의 BMI는 %.2f 이며,%s 입니다.",bmi,result);
		//System.out.println("당신은 :" +result+"입니다.");
	}

}
