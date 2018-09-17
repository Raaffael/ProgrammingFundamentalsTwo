
public class BankAccount {
	private double balance;
	private int numOfDeposits;
	private int numOfWithdrawals;
	private double annInterestRate;
	private double monServiceCharge;
	
	public BankAccount(double balance, double annInterestRate){
		this.balance = balance;
		this.annInterestRate = annInterestRate;
	}
	public void deposit(double depAmnt) {
		System.out.println("Depositing $" + depAmnt + " ...");
		this.balance += depAmnt;
		this.numOfDeposits++;
		System.out.println("Your current balance is: $" + getBalance());
	}
	public void withdraw(double withAmnt) {
		System.out.println("Withdrawing $" + withAmnt + " ...");
		this.balance -= withAmnt;
		this.numOfWithdrawals++;
		System.out.println("Your current balance is: $" + getBalance());
	}
	public void calcInterest() {
		double monthIntRate = (this.annInterestRate/12);
		double monthInterest = (this.balance * monthIntRate);
		this.balance = (this.balance + monthInterest);
	}
	public void monthlyProcess() {
		System.out.println("Total withdrawals: " + this.numOfWithdrawals + 
				"\nTotal deposits: " + this.numOfDeposits +
				"\nTotal monthly charges: $" + this.monServiceCharge);
		this.balance = (this.balance - this.monServiceCharge); // Subtracts monthly charges
		calcInterest(); 
		System.out.println("Balance after interest and charges applied: $" + getBalance());
		this.numOfDeposits = 0; // Resets variables to 0
		this.numOfWithdrawals = 0;
		this.monServiceCharge = 0;
	}
	public double getBalance() {
		return (int)Math.round(this.balance*100)/(double)100;
	}
	public int getNumOfWithdrawals() {
		return this.numOfWithdrawals;
	}
	public void addADollar() {
		this.monServiceCharge++;
	}
}
