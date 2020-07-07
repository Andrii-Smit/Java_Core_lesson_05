package task2;

public class Animal {
	private int weight;
	private int height;
	private String name;
	private String type;

	public Animal(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	public Animal(int weight, int height, String name, String type) {
		this(weight, height);
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return "box [weight=" + weight + ", height=" + height + ", name=" + name + ", type=" + type + "]";
	}

}