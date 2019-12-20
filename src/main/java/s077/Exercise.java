package s077;

public class Exercise {
	public static void main(String[] args) {

		Pet[] pets = { new Dog("Tom"), new Cat("Jim") };

		for (Pet pet : pets) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.bark();  //forma condensata: ((Dog) pet).bark();
			} else if (pet instanceof Cat) {
				Cat cat = (Cat) pet;
				cat.meow();
			} else {
				System.out.println("Unknown pet");
			}
		}
	}

}
