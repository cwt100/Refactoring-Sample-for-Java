package move.method;

public class AccountType {

	boolean isPremium() {
		boolean result = true;
		return result;
	}
	
	double overdraftCharge(Account account) {
		double result = 0;
		if (isPremium()) {
			result = 10;
			if (account.getDayOverdrawn() > 7) {
				result += (account.getDayOverdrawn() - 7) * 0.85;
			}
		} else {
			result = account.getDayOverdrawn() * 1.75;
		}
		return result;
	}
}
