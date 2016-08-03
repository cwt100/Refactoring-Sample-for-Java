package move.method;

public class Account {

	private AccountType _accountType;
	private int _dayOverdrawn;
	
	double bankCharge() {
		double result = 4.5;
		if (_dayOverdrawn > 0) {
			result += _accountType.overdraftCharge(this);
		}
		return result;
	}
	
	public int getDayOverdrawn() {
		return _dayOverdrawn;
	}
}
