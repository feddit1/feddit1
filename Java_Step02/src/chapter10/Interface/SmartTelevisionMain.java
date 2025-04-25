package chapter10.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTeleVision tv = new SmartTeleVision();

		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("youtube");
		System.out.println();

		// Remote 클래스에 정의되어있는 메서드만 오버라이딩된 메서드 대입
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();

		// Searchable 클레스에 정의되어있는 메서드만 오버라이딩되니 메서드 대입
		Searchable sc = tv;
		sc.search("LLL");

	}

}
