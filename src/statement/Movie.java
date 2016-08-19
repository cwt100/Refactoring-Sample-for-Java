package statement;

public class Movie {
	
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String _title;
	private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public int get_priceCode() {
		return _priceCode;
	}

	public void set_priceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}

	public String get_title() {
		return _title;
	}
	
	double getCharge(int daysRented) {
		
		double result = 0;
		switch (get_priceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 3) * 1.5;
			}
			break;
		default:
			break;
		}
		return result;
	}
	
	int getFrequentRenterPoints(int daysRented) {
		int result = 1;//Default.
		//add bonus for a two day new release rental.
		if (get_priceCode() == Movie.NEW_RELEASE && daysRented > 1) {
			result = 2;
		}
		return result;
	}
}
