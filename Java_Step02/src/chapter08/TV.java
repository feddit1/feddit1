package chapter08;

public class TV extends Appliance {

	public TV(String brand) {
		super(brand);
	}
	
	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		System.out.println("TV를 켭니다.");
	}

}
