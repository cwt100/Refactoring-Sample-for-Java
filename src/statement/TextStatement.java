package statement;


public class TextStatement extends Statement {
	
	String headerString(Customer customer) {
		return "Rental Record for" + customer.getName() + "\n";
	}

	String eachRentalString(Rental rental) {
		return "\t" + rental.getMovie().get_title() + "\t"
				+ String.valueOf(rental.getCharge()) + "\n";
	}

	String footerString(Customer customer) {
		return "Amount owed is " + String.valueOf(customer.getTotalCharge())
				+ "\n" + "You earned "
				+ String.valueOf(customer.getTotalFrequentRenterPoints())
				+ "frequent renter points";
	}
}
