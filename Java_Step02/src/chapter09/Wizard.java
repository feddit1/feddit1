package chapter09;

public class Wizard extends GameCharacter {

	@Override
	protected void attack() {
		System.out.println("마법사가 파이어볼을 발사합니다!");
		
	}

	@Override
	protected void useUltimate() {
		System.out.println("마법사가 미티어 스톰을 시전합니다!");
		
	}

}
