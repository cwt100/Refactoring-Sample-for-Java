package statement;

import java.util.Enumeration;
import java.util.Vector;


public class Customer {

	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String name) {
		_name = name;
	}
	
	public void addRental(Rental rental) {
		_rentals.addElement(rental);
	}
	
	public String getName() {
		return _name;
	}
	
	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for" + getName() + "\n";
		
		while(rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();
			
			//show figures for this rental.
			result += "\t" + each.getMovie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		
		//add footer lines.
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter points";
		return result;
	}
	
	public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><P>\n";
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getMovie().get_title() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		
		//add footer lines.
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM> frequent renter points";
		return result;
	}
	
	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
