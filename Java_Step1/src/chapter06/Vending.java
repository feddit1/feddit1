package chapter06;

public class Vending {

	private Can[] can = new Can[5];
	private int money;

	// 생성자 (선택사항)
	public Vending() {
		init(); // 객체 생성 시 음료 초기화
	}

	// 음료 초기화
	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("밀키스", 2000);
		can[2] = new Can("알로에", 1500);
		can[3] = new Can("콜라", 1300);
		can[4] = new Can("사이다", 1200);
	}

	// 돈을 넣는 메소드
	public void insertMoney(int m) {
		this.money = m;
		System.out.println("현재 투입 금액: " + money + "원");
	}

	// 사용 가능한 음료만 출력
	public void showCans() {
		System.out.println("구입 가능한 음료 목록:");
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice() + "원");
			}
		}
	}

	// 음료 선택
	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (name.equals(can[i].getCanName())) {
				if (can[i].getPrice() <= money) {
					System.out.println("선택하신 " + can[i].getCanName() + "를(을) 출력합니다.");
				}
			}
			System.out.println("해당 이름의 음료가 없습니다.");
		}
	}
}