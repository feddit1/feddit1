package chapter09;

public class GameMain {

	public static void main(String[] args) {
		System.out.println("====전사 전투====");
		GameCharacter warrior = new Warrior();
		warrior.fight();
		System.out.println("====마법사 전투====");
		GameCharacter wizard = new Wizard();
		wizard.fight();
	}

}
