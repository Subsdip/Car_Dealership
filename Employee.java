package car_dealership;

public class Employee {
	
	private String name;
	private String mobile_number;
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = Math.abs(vehicle.getPrice() - cust.getCashOnHand());
			runCreditHistory(cust, loanAmount);
		}
		else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		}
		else {
			System.out.println("Customer will need more money to purchase the vehicle " + vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		if(loanAmount <= cust.loanEligibility) {
			System.out.println("Customer is eligible to take loan.");
			System.out.println("Loan eligibility -> " + cust.loanEligibility);
			System.out.println("Down Payment -> " + cust.getCashOnHand());
			System.out.println("Loan amount -> " + loanAmount);
		}else {
			System.out.println("Customer is not eligible for the loan.");
			System.out.println("Loan eligibility -> " + cust.loanEligibility);
		}
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle.");
		System.out.println(" ");
		System.out.println("Name -> " + cust.getName());
		System.out.println("Address -> " + cust.getAddress() + ".");
		System.out.println(" ");
		System.out.println("Vehicle details " + vehicle);
		System.out.println(" ");
		System.out.println("Bought from " + this.name + ". Contact information -> " + this.mobile_number);
		System.out.println("Toofan automobiles.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
}
