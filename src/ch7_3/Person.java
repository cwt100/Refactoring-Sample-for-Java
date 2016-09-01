package ch7_3;

public class Person {

	private String _name;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();
	
	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return _officeTelephone.getTelephoneNumber();
	}
	
	public TelephoneNumber getOfficeTelephone() {
		return _officeTelephone;
	}
}
