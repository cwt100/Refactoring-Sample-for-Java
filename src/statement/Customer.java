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
	
	public Vector getRentals() {
		return _rentals;
	}
	
	public String statement() {
		return new TextStatement().value(this);
	}
	
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}
	
	double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
