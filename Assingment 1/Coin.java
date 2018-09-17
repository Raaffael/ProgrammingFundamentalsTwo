
public class Coin {
	private String sideUp;
	
	public Coin() {
		this.sideUp = getSideUp();
		
	}
	
	public void toss() {
		int randomNumber = (int)(Math.random()*10);
		if(randomNumber % 2 == 0) {
			this.sideUp = "tails";
		}
		else {
			this.sideUp = "heads";
		}
	}
	
	public String getSideUp() {
		toss();
		return this.sideUp;
	}

}
