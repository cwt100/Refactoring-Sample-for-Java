package statement;

public class Rental {

	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	double getCharge() {
		
		double result = 0;
		switch (getMovie().get_priceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (getDaysRented() > 2) {
				result += (getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (getDaysRented() > 3) {
				result += (getDaysRented() - 3) * 1.5;
			}
			break;
		default:
			break;
		}
		return result;
	}
	
	int getFrequentRenterPoints() {
		int result = 1;//Default.
		//add bonus for a two day new release rental.
		if (getMovie().get_priceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
			result = 2;
		}
		return result;
	}
}
