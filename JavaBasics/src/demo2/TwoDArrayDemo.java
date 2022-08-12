package demo2;

public class TwoDArrayDemo {
	
	public static void main(String[] args) {
		String[][] cities = new String[4][3];
		
		cities[2][1] = "London";
		cities[3][2] = "Paris";
		
		System.out.println(cities[3][2]);
		System.out.println(cities[2][1]);
		
	}

}
