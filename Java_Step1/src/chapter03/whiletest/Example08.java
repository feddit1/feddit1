package chapter03.whiletest;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {

		boolean run = true;
		int num, breadnum;
		String str;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");

			// 번호입력 받기
			Scanner scan = new Scanner(System.in);
			num = Integer.parseInt((scan.nextLine()));

			switch (num) {
			case 1: // 빵의 개수 입력받기
				System.out.print("빵 갯수를 입력하시오");
				// Scanner scan2 = new Scanner(System.in);
				breadnum = scan.nextInt();
				for (int i = 0; i < breadnum; i++) {
					System.out.println("빵" + (i + 1) + "개");
				}
				System.out.println("빵 " + breadnum + "개");

				break;
			case 2:
				System.out.println("빵 갯수입력");
				breadnum = Integer.parseInt((scan.nextLine()));
				System.out.println("빵 종류 입력");
				str = scan.nextLine();

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
	}// m

}// c
