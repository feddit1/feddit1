package chapter05;

import java.util.Scanner;

public class FuncTest_05 {

	//void 는 반환값이 없다
	public static void EduStep(int step) {
		
		if(step==1) {
			System.out.println("해당하는 스터디 단계는 1 입니다.");
		}else if(step==2) {
			System.out.println("해당하는 스터디 단계는 2 입니다.");
		}else if(step==3){
			System.out.println("해당하는 스터디 단계는 3 입니다.");
		}else {
			System.out.println("해당하는 스터디 단계가 없습니다");
		}
	}
	
	
	public static void main(String[] args) {
		
		//입력받아서 number
		Scanner sc = new Scanner(System.in);
		System.out.println("스터디 단계를 입력하세여: ");
		int number = sc.nextInt();
		
		EduStep(number);
		
		

	}

}
