package chapter08;

public class Taxi extends Vehicle_10 {

	private int taxiNum = 999999999;

	@Override
	public void run() {
		System.out.println(taxiNum + "번 택시가 달립니다.");
	}

}
