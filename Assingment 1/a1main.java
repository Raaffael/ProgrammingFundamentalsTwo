
public class a1main {
	
	static Coin quarter = new Coin();
	static Coin dime = new Coin();
	static Coin nickel = new Coin();
	static int balance;
	static int headToss = 0;
	static int tailToss = 0;

	public static void main(String[] args) {
		System.out.println("Starting Balance = $" + balance);
		System.out.println();
		runGame();
		isWinner();
		
		
	}
	
	private static void isWinner() {
		System.out.println("Flipping coins...");
		System.out.println("$"+(double)balance/100);
		if(balance == 100) {
			System.out.println("You win the Game!");
		}else {
			System.out.println("You lose.");
		}
		System.out.println("Totals - Heads: " + headToss + " Tails: " + tailToss);
	}

	public static void runGame() {
		while(balance < 100) {
			if(quarter.getSideUp().equals("heads")&&balance<100) {
				balance += 25;
				headToss++;
			}else {
				balance += 0;
				tailToss++;
			}
			//System.out.println(balance + " *quarter*");
			if(dime.getSideUp().equals("heads")&&balance<100) {
				balance += 10;
				headToss++;
			}else {
				balance += 0;
				tailToss++;
			}
			//System.out.println(balance + " *dime*");
			if(nickel.getSideUp().equals("heads")&&balance<100) {
				balance += 5;
				headToss++;
			}else {
				balance += 0;
				tailToss++;
			}
			//System.out.println(balance + " *nickel*");
		}
	}

}
