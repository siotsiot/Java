class Dog {
	private String name;
	private int age;
	private String color;
	static int count;
	
	public Dog() {
		name = "Molly";
		age = 10;
		color = "brown";
		count++;
	}
	public Dog(int age) {
		name = "Daisy";
		this.age = age;
		color = "black";
		count++;
	}
	public Dog(String name) {
		this.name = name;
		age = 7;
		color = "white";
		count++;
	}
	
	String getDogName() {
		return name;
	}
	
	int getDogAge() {
		return age;
	}
	int setDogAge(int age) {
		return this.age = age;
	}
	
	String getDogColor() {
		return color;
	}
}

class Witch {
	static void younger(Dog dog) {
		dog.setDogAge(dog.getDogAge() - 5);
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog(6);
		Dog d3 = new Dog("Bella");
		
		Witch.younger(d1);
		Witch.younger(d2);
		Witch.younger(d3);
		
		int num = Dog.count;
		System.out.println("강아지 #1 = \"" + d1.getDogName() + "\", " + d1.getDogAge() + ", " + d1.getDogColor());
		System.out.println("강아지 #2 = \"" + d2.getDogName() + "\", " +d2.getDogAge() + ", " + d2.getDogColor());
		System.out.println("강아지 #3 = \"" + d3.getDogName() + "\", " +d3.getDogAge() + ", " + d3.getDogColor());
		System.out.println("현재까지 생성된 강아지의 수 = " + num);
	}
}
