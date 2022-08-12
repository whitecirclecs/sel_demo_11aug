package demo;

public class Calculator {

	public void add(int a, int b) { //defining the add() method
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(double a, double b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		// Class object = new Class();
		Calculator basicCalculator = new Calculator();

		// object.method()
		basicCalculator.add(10, 20); //add() method is being called here
		basicCalculator.subtract(15, 10);
		basicCalculator.multiply(20, 30);
		basicCalculator.divide(100, 3);
	}

}
