package ch7_2;

public class Account {

	private AccountType _type;
	
	double interestForAmount_days(double amount, int days) {
		return _type.getInterestRate() * amount * days / 365;
	}
}
