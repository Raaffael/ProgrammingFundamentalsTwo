
public class a6main {

	public static void main(String[] args) {
		partA();
		partB();
	}
	
	public static void partA() {
		String name = "Frank Castle";
		String address = "4321 257th Street, Queens, NY";
		String telephoneNumber = "(210) 765-4321";
		int customerID = 4670;
		boolean customerIsOnList = false;
		Customer customerOne = new Customer(name, address, telephoneNumber, customerID, customerIsOnList);
		System.out.println("EXAMPLE OF THE CUSTOMER CLASS" +
						   "\nThe customer's name is " + customerOne.getName() + 
						   "\nAddress: " + customerOne.getAddress() +
						   "\nTelephone number: " + customerOne.getTelephoneNumber() +
						   "\nCustomer ID: " + customerOne.getCustomerNumber());
		if(customerOne.isOnList()==true)
			System.out.println("The customer is on the mailing list!");
		else
			System.out.println("The customer is NOT on the the mailing list.\n ");
	}
	public static void partB() {
		String name = "John Wick";
		String address = "1234 Laurel Hill Boulevard, Queens, NY";
		String telephoneNumber = "(210) 123-4567";
		int customerID = 4672;
		boolean customerIsOnList = true;
		int amountPurchased = 565;
		PreferredCustomer customerTwo = new PreferredCustomer(name, address, telephoneNumber, customerID, customerIsOnList, amountPurchased);
		System.out.println("EXAMPLE OF THE PREFERRED CUSTOMER CLASS" +
				   		   "\nThe customer's name is " + customerTwo.getName() + 
						   "\nAddress: " + customerTwo.getAddress() +
						   "\nTelephone number: " + customerTwo.getTelephoneNumber() +
						   "\nCustomer ID: " + customerTwo.getCustomerNumber());
		if(customerTwo.isOnList()==true)
			System.out.println("The customer is on the mailing list!");
		else
			System.out.println("the customer is NOT on the the mailing list.");
		System.out.println("As a member of the preferred customer plan, the customer has spent $" + customerTwo.getAmountPurchased() + " and will receive a discount of "
				+ customerTwo.getDiscount() + "% on all future purchases!");
	}

}
