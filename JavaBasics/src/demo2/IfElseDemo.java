package demo2;

import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		
		if (age>=16  && age<=18) {
			System.out.println("You are eligible for a learner's license");
		}
		
		else if (age > 18){
			System.out.println("You are eligible for a driving license");
		}
		
		else {
			System.out.println("You are not eligible for a driving license");
		}
	}

}
