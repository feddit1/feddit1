package chapter06;

import java.util.Random;

public class UpDown {

	// 멤버변수
	private int pcnum = new Random().nextInt(50) + 1;
	private int count;
	private String result = "FALSE";

	// 생성자

	// 메서드
	public String check(int mynumber) {
		count++;
		if (mynumber < pcnum) {
			System.out.println("UP");
		} else if (mynumber < pcnum) {
			System.out.println("Down");
		} else {
			System.out.println(count + "회 만에 정답!");
			result = "SUCCESS";
		}
		return result;
	}

}
