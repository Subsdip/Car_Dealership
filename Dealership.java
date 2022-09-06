package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.setName("Subhadip Mukherjee");
		cust1.setAddress("2 no. noon gola lane, bhadreswar, hooghly");
		cust1.setCashOnHand(1000000);
		cust1.setLoanEligibility(800000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setMake("Maruti Suzuki");
		vehicle.setModel("Swift Dezire VDI");
		vehicle.setPrice(800000);
		
		Employee emp = new Employee();
		emp.setName("Sumir Biswas");
		emp.setMobile_number("+91-9856412732");
		
		cust1.purchaseCar(vehicle, emp, true);
		
	}

}
