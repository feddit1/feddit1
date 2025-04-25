package chapter03.swichtest;

public class SwitchCase_06 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()*10)+9; //??
		System.out.println("현재시간 : "+time + "시");
		System.out.println("할 일");
		
		switch (time) {
		case 9:
			System.out.println("기상");
			break;
		case 10:
			System.out.println("식사");
			break;
		case 11:
		case 12:
		case 13:
			System.out.println("준비");
			break;
			
		default:
			System.out.println("휴식");
		}

	}

}
