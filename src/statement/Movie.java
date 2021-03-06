package statement;

public class Movie {
	
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String _title;
	private Price _price;
	
	public Movie(String title, int priceCode) {
		_title = title;
		set_priceCode(priceCode);
	}

	public int get_priceCode() {
		return _price.getPriceCode();
	}

	public void set_priceCode(int _priceCode) {
		switch (_priceCode) {
		case Movie.REGULAR:
			_price = new RegularPrice();
			break;
		case Movie.CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case Movie.NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public String get_title() {
		return _title;
	}
	
	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
}
