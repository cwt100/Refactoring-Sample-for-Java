package ch7_3;

public class TelephoneNumber {

	private String _areaCode;
	private String _number;
	
	public String getAreaCode() {
		return _areaCode;
	}
	
	public void setAreaCode(String areaCode) {
		_areaCode = areaCode;
	}
	
	public String getNumber() {
		return _number;
	}
	
	public void setNumber(String number) {
		_number = number;
	}
	
	public String getTelephoneNumber() {
		return ("(" + _areaCode + ") " + _number);
	}
}
