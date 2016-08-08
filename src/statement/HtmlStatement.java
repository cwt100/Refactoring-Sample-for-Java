package statement;


public class HtmlStatement extends Statement {

	String headerString(Customer customer) {
		return "<H1>Rental Record for <EM>" + customer.getName()
				+ "</EM></H1><P>\n";
	}

	String eachRentalString(Rental rental) {
		return rental.getMovie().get_title() + ": "
				+ String.valueOf(rental.getCharge()) + "<BR>\n";
	}

	String footerString(Customer customer) {
		return "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge())
				+ "</EM><P>\n" + "On this rental you earned <EM>"
				+ String.valueOf(customer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points";
	}
}
