package introduce.parameter.object;

import java.util.Date;

public class Entry {

	private double _value;
	private Date _chargeDate;
	
	Entry(double value, Date chargeDate) {
		_value = value;
		_chargeDate = chargeDate;
	}
	
	double getValue() {
		return _value;
	}
	
	Date getChargeDate() {
		return _chargeDate;
	}
}
