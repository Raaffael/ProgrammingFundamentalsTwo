
public class PreferredCustomer extends Customer{
	private int amountPurchased;
	private  int discountLevel;
	
	public PreferredCustomer(String name, String address, String telephoneNumber, int customerNumber, boolean onList, int amountPurchased) {
		super(name, address, telephoneNumber, customerNumber, onList);
		this.amountPurchased = amountPurchased;
	}
	public int getAmountPurchased() {
		return this.amountPurchased;
	}
	public int getDiscount() {
		if(this.amountPurchased >= 500)
			this.discountLevel = 5;
		else if(this.amountPurchased >= 1000)
			this.discountLevel = 6;
		else if(this.amountPurchased >= 1500)
			this.discountLevel = 7;
		else if(this.amountPurchased >= 2000)
			this.discountLevel = 10;
		else
			this.discountLevel = 0;
		return this.discountLevel;
	}

}
