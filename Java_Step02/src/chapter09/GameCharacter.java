package chapter09;

public abstract class GameCharacter {

	// 템플릿 메서드: 전투게임 순서 정의
	public final void fight() {
		enterBattlefield(); // 전투게임 시작
		attack(); // 게임->하위 클래스의 구현
		useUltimate();// 아이템 사용->하위 클래스이 구현
		leaveBattlefield();// 전투게임 종료
	}

	// 공통 메서드
	private void enterBattlefield() {
		System.out.println("[입장] 캐릭터가 전장에 등장");
	}

	private void leaveBattlefield() {
		System.out.println("[퇴장] 캐릭터가 전장을 떠남");
	}

	// 하위 클래스가 반드시 구현해야 하는 추상메서드
	protected abstract void attack();

	protected abstract void useUltimate();

}
