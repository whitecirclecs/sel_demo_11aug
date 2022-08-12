package inheritance;

public class Bike extends Vehicle{
	int speed = 50;
	
	public void displaySpeed() {
		System.out.println("Speed of Bike = " + super.speed + " mph"); //super.speed refers to parent class's speed variable
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.displaySpeed();
	}
	
}
