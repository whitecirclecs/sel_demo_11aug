package demo2;

public class Thermometer {
	
	public float getTemperatureInfo() {		
		float temperature = 24.7f;
		return temperature;
	}

	public static void main(String[] args) {
		//Class object = new Class();
		Thermometer thermometer = new Thermometer();
		float output = thermometer.getTemperatureInfo();
		System.out.println("It is " + output + " degrees celcius right now");
	}
	
}
