package car_dealership;

public class Customer {
	
	String name;
	String address;
	double cashOnHand;
	double loanEligibility;
	
	public double getLoanEligibility() {
		return loanEligibility;
	}

	public void setLoanEligibility(double loanEligibility) {
		this.loanEligibility = loanEligibility;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}
}
