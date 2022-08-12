package demo2;

public class Information {
	
	public String getNameInfo() {
		String name = "Tom";
		return name;
	}
	
	public static void main(String[] args) {
		Information information = new Information();
		String output = information.getNameInfo();
		System.out.println("My name is " + output);
	}

}
