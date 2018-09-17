
public class Odometer {
	
	private int mileage;
	
	public Odometer() {
		
	}
	
	public int reportMileage() {
		return mileage;
	}
	
	public void addAMile() {
		if(mileage>=999999)
			mileage = 0;
		else
			mileage++;
	}
	
	public void milesPerGallon(FuelGauge gauge) {
		if(mileage%24==0 && mileage > 0)
			gauge.takeAGallon();
	}

}
