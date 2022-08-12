package inheritance;

import demo2.Animal;

public class Elephant extends Animal{
	
	public void food() {
		System.out.println("This animal eats 20 kg of food daily");
	}
	
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		elephant.food();
	}

}
