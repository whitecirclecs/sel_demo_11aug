package demo;

public class Car {

	public static void main(String[] args) {
		// Class object = new Class();
		Car mercedes = new Car(); // mercedes is an object of class Car

		//Properties of Mercedes
		int numberOfTyres = 4;

		String colorOfCar = "Silver";
		String myFavoriteColor = "My favorite color is White";

		double heightOfCar = 155.5;
		float temperatureInsideCar = 17.8f;

		boolean didISeeAMercToday = false;

		char modelOfCar = 'S';
		// sysout + ctrl +space
		System.out.println("Today is Thursday");
		System.out.println(myFavoriteColor);
		System.out.println("Height of car is " + heightOfCar + " cms");
		System.out.println("Temperature inside the car was " + temperatureInsideCar + " degrees celcius");
		System.out.println("I have a Tesla Model " + modelOfCar);
	}

}
