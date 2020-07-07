package task1;

public class Application {
	public static void main(String[] args) {
		
		Cow cow = new Cow(1,1);
		cow.voice();
		Cat cat = new Cat(1,1);
		cat.voice();
		Dog dog = new Dog(1,1);
		dog.voice();
	}
}
