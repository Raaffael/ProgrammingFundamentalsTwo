
public class FuelGauge {
	
	private int gallonsOfGas;
	
	public FuelGauge() {
				
	}
	
	public int reportGas() {
		return gallonsOfGas;
	}
	
	public void addAGallon() {
		if(gallonsOfGas<15)
			gallonsOfGas++;
	}
	
	public void takeAGallon() {
		if(gallonsOfGas>0)
			gallonsOfGas--;
	}

}
