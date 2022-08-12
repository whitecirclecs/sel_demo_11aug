package demo2;

public class Car {

	private String color; // Global variables being declared
	private String engineType;

	public Car(String color, String engineType) {
		this.color = color; // Global variables being initialized
		this.engineType = engineType;
	}

	public void printCarInfo() {
		System.out.println("Color of Car = " + color);
		System.out.println("Type of engine = " + engineType);
	}

	public static void main(String[] args) {
		Car mercedes = new Car("silver", "petrol");
		Car audi = new Car("black", "diesel");

		// object.method()
		mercedes.printCarInfo();
		audi.printCarInfo();
		
	}

}
//Class tests
//Hello Ashna
//Hello Teacher!

