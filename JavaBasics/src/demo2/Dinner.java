package demo2;

public class Dinner {
	
	public boolean hadDinner() {
		boolean didYouHaveDinner = true;
		return didYouHaveDinner;
	}
	
	public static void main(String[] args) {
		//Class object = new Class();
		Dinner dinner = new Dinner();
		boolean dinnerStatus = dinner.hadDinner();
		System.out.println(dinnerStatus);
	}
	
	

}
