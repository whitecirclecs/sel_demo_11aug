package demo;

public class Test {
	
	//Calling methods of one class in another class
	//Call add() method from Calculator class in this class
	public static void main(String[] args) {
		//Class object = new Class();
		Calculator calculator = new Calculator();
		calculator.add(20, 30);
		
		//Call the greetings method from Printer class in this class
		//Create object of that class which contains your method
		Printer printer = new Printer();
		printer.greetings();
		printer.isEveryonePresent();
		printer.printName("Brad");
		printer.printName("Tom");
	}

}
