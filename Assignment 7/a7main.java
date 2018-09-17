
public class a7main {

	public static void main(String[] args) {
		bankAccountDemo();
	}

	public static void bankAccountDemo() {
		double startBalance = 200.35;
		double annualInterestRate = 1.8; 
		SavingsAccount savings = new SavingsAccount(startBalance, annualInterestRate);
		System.out.println("Starting balance: $ " + startBalance + 
				"\nInterest Rate: " + annualInterestRate + "%\n");
		savings.viewStatus();
		savings.withdraw(180);	
		savings.viewStatus();
		savings.withdraw(5);	
		savings.viewStatus();
		savings.deposit(235);	
		savings.viewStatus();
		savings.withdraw(26.3);
		savings.viewStatus();
		savings.deposit(235);
		savings.viewStatus();
		savings.withdraw(223.3);
		savings.viewStatus();
		savings.withdraw(29.3);
		savings.viewStatus();
		savings.withdraw(186.45);
		savings.viewStatus();
		savings.withdraw(.01);
		savings.monthlyProcess();
		savings.viewStatus();
	}

}
