package chapter06;

public class Subway {

	//멤버변수
	String lineNumber;
	int passengerCount;
	int money;
	
	//생성자 오버로딩
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	//메서드
	public void take(int money) {//승객이 낸돈
		this.money+=money;//버스 수입
		passengerCount++;//승객의 수 증가
	}
	
	public void showinfo() {
		System.out.println(lineNumber+"번 버스의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
	
}
