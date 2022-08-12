package inheritance;

import demo2.Calculator;

public class D extends Calculator{
	
	public void date() {
		System.out.println("It is 28June, 2022");
	}
	
	public void day() {
		System.out.println("Today is Wednesday");
	}
	
	public static void main(String[] args) {
		D d = new D();
		//d.add(1, 15);
	}
	

}
//Class D is the parent class
//And Class A, B and C are the child classes