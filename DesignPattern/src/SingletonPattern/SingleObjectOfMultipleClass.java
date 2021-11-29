package SingletonPattern;

import org.junit.jupiter.api.Test;

public class SingleObjectOfMultipleClass {

	@Test
	public void MultipleSingleObjectTest() {
		Animal animal = new Animal();
		Bird bird = new Bird();
	}
}

class Animal {

	private static int count = 0;

	Animal() {
		synchronized (Animal.class) {
			System.out.println("Creating Object" + getClass() + " " + count);
			if (count >= 1) {
				throw new RuntimeException("Can't create two objects");
			}
			count++;
			System.out.println("Object created for " + getClass() + " " + count);
		}

	}
}

class Bird extends Animal {
	int name;

}

class FlyableBird extends Animal {

}