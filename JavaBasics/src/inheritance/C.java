package inheritance;

public class C extends D{
	
	public void year() {
		System.out.println("It is 2022");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.year();
		c.date();
	}

}
