package demo2;

public class Printer {	
	public String getDayInfo() {
		String day = "Friday";
		return day;
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		String output = printer.getDayInfo();
		
		System.out.println(output);
	}
	
	

}
