package chapter09;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani1 = new Cat();
		Animal ani2 = new Dog();
		
		animalSound(ani1);
		animalSound(ani2);

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
