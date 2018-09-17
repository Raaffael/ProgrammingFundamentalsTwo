
public class a4main {

	public static void main(String[] args) {
		FuelGauge gauge = new FuelGauge();
		Odometer meter = new Odometer();
		fillUp(gauge, meter);
		for(int i = 0; gauge.reportGas()>0; i++) {
			meter.addAMile();
			meter.milesPerGallon(gauge);
			System.out.println("Current fuel: " + gauge.reportGas() + " gallons, Current mileage: " + meter.reportMileage() + " miles.");
		}
		
		
	}
	
	public static void fillUp(FuelGauge gauge, Odometer meter) {
		System.out.println("Current fuel: " + gauge.reportGas() + " gallons, Current mileage: " + meter.reportMileage() + " miles.");
		System.out.println("Filling up the tank...");
		while(gauge.reportGas() < 15) {
			gauge.addAGallon();
			System.out.println("Current fuel: " + gauge.reportGas() + " gallons, Current mileage: " + meter.reportMileage() + " miles.");
		}
		System.out.println("Now relax and enjoy the trip!");
		
	}

}
