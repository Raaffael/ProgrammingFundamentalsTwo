
public class Customer extends Person {
	private int customerNumber;
	private boolean onList;
	
	public Customer(String name, String address, String telephoneNumber, int customerNumber, boolean onList) {
		super(name, address, telephoneNumber);
		this.customerNumber = customerNumber;
		this.onList = onList;
	}
	public int getCustomerNumber() {
		return this.customerNumber;
	}
	public boolean isOnList() {
		return this.onList;
	}
}
