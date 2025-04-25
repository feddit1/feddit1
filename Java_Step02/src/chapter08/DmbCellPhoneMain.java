package chapter08;

public class DmbCellPhoneMain {

	public static void main(String[] args) {

		DmbCellPhone dmb = new DmbCellPhone(111, "S25", "은색");

		// 상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);

		// 자식클래스 필드
		System.out.println("채널: " + dmb.channel);
		
		//전화통화 구현
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("Hi");
		dmb.receiveVoice("yeah");
		dmb.sendVoice("lunch");
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.changeChannelDmb(5);
		dmb.turnOffDmb();

	}

}
