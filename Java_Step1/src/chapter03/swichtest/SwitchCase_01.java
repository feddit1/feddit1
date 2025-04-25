package chapter03.swichtest;

public class SwitchCase_01 {

	public static void main(String[] args) {
		//

		int ranking = 5;
		char medalColor;

		switch (ranking) {
		case 1: {

			medalColor = 'G';
			break;
		}
		case 2: {

			medalColor = 'S';
			break;
		}
		case 3: {

			medalColor = 'B';
			break;
		}
		default: {
			medalColor = 'A';
		}
		}
		System.out.println(ranking + "등 메달은" + medalColor + "입니다");

		System.out.println("--------------------------------");

		//스위치 구문이 더 많이 쓰이고 / 더 빠름
		//원리 :  jump table(스위치구문) / 처음부터 쭉 읽음(if구문)  
		// if
		if (ranking == 1) {
			medalColor = 'G';
		} else if (ranking == 2) {
			medalColor = 'S';
		} else if (ranking == 3) {
			medalColor = 'B';
		} else {
			medalColor = 'A';
		}

	}

}
