
public class SavingsAccount extends BankAccount {
	private boolean status = true;
	

	public SavingsAccount(double balance, double annInterestRate) {
		super(balance, annInterestRate);
	}
	public void deposit(double depAmnt) {
		if(getBalance() < 25) {	//Determines whether the account is active
			this.status = false; 
			super.deposit(depAmnt); //Makes deposit using superclass
			if(getBalance() > 25) { //Checks balance after deposit
				this.status = true; 
			}
		}
		else {
			this.status = true;
			super.deposit(depAmnt);
		}
		System.out.println("--------------------------------------------------------------------");
	}
	public void withdraw(double withAmnt) {
		if(getBalance() < 25) { // Determines account status
			this.status = false;
			System.out.println("No withdrawals are allowed."); // No withdrawals allowed on inactive accounts
		}
		else {
			super.withdraw(withAmnt); //Makes withdrawal using superclass
			if(getBalance() < 25) 
				this.status = false; //Deactivates account if withdrawal brings account below 25
		}
		System.out.println("--------------------------------------------------------------------");
	}
	public void monthlyProcess() {
		for(int i = 0; getNumOfWithdrawals() - 4 > i ;i++ ) {
			addADollar();
		}
		super.monthlyProcess();
		if(getBalance() < 25)
			this.status = false;
		else
			this.status = true;
	}
	public void viewStatus() {
		if (this.status == true) 
			System.out.println("This account is ACTIVE.");
		else
			System.out.println("This account is INACTIVE.");
	}
	

}
