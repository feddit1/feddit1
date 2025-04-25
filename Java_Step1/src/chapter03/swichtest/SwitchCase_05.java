package chapter03.swichtest;

public class SwitchCase_05 {

	public static void main(String[] args) {
		
		int num =(int)(Math.random()*10)+1; //캐스팅,명시적 형변환
		
		switch(num) {
		case 1:{
			System.out.println(num + "점 획득");
			break;
		}
		case 2:{
			System.out.println(num + "점 획득");
			break;
		}
		case 3:{
			System.out.println(num + "점 획득");
			break;
		}
		case 4:{
			System.out.println(num + "점 획득");
			break;
		}
		case 5:{
			System.out.println(num + "점 획득");
			break;
		}
		case 6:{
			System.out.println(num + "점 획득");
			break;
		}
			
		default:
			System.out.println(num + "은(는) 잘못된 숫자입니다.");
		}//스위치
	}

}
