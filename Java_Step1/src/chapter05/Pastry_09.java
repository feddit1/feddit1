package chapter05;

import java.util.Scanner;

public class Pastry_09 {

	// 멤버변수

	// 생성자

	// 메서드 //힙의 영역
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}

	//메서드2
	public void makeBread(int cnt) {

		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 빵을 만듭니다");
		}
		System.out.println("요청사항" + cnt + "개의 빵 제작 완료");
	}

	//메서드3
	public void makeBread(int cnt,String name) {

		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 빵을 만듭니다");
		}
		System.out.println("요청사항" + cnt + "개의 "+ name +"빵 제작 완료");
	}
	
	//--------------------------------------------------------------
	
	
	void order() {
		
		boolean run = true;
		int num, breadnum;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");

			// 번호입력 받기
			Scanner scan = new Scanner(System.in);
			int input_num = Integer.parseInt((scan.nextLine()));

			switch (input_num) {
			case 1: // 빵의 개수 입력받기
				System.out.print("빵 갯수를 입력하시오");
				// Scanner scan2 = new Scanner(System.in);
				breadnum = sc.nextInt();
				for (int i = 0; i < breadnum; i++) {
					System.out.println("빵" + (i + 1) + "개");
				}
				System.out.println("빵 " + breadnum + "개");

				break;
			case 2:
				System.out.println("빵 갯수입력");
				breadnum = Integer.parseInt((sc.nextLine()));
				System.out.println("빵 종류 입력");
				str = sc.nextLine();

				for (int i = 0; i < breadnum; i++) {
					System.out.println(str + "빵" + (i + 1) + "개");
				}

				System.out.println("주문한"+str+"빵"+(breadnum)+"개");
				break;
			case 3:
				System.out.println("종료");
				run = false;
				break;

			default:
				System.out.println("잘못입력함, 다시.");
			}//sw
		} // w
	}//main
}//class
