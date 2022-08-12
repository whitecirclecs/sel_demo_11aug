package loops;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		int PINinDB = 4321;
		
		//Class object = new Class()
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your PIN: ");
		int PINenteredByUser = scanner.nextInt(); //object.method()
		
		while(PINenteredByUser != PINinDB) {
			System.out.println("The ATM PIN you entered is incorrect! Please try again!");
			PINenteredByUser = scanner.nextInt();
		}
		
		System.out.println("Welcome to ABC Bank!");		
		scanner.close();
		
	}

}
