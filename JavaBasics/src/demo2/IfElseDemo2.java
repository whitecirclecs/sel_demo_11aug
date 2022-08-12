package demo2;

import java.util.Scanner;

public class IfElseDemo2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What time is it ? ");
		String time = scanner.nextLine();
		
		if (time.equals("morning")) {
			System.out.println("Prepare Breakfast");
		}
		
		else if (time.equals("afternoon")) {
			System.out.println("Prepare lunch");
		}
		
		else {
			System.out.println("Prepare dinner");
		}
	}

}
