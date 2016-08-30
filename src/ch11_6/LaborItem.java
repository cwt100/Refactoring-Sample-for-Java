package ch11_6;

public class LaborItem extends JobItem {

	public LaborItem(int quantity, Employee employee) {
		super(0, quantity);
		_employee = employee;
	}
	
	public Employee getEmployee() {
		return _employee;
	}
	
	@Override
	public int getUnitPrice() {
		return _employee.getRate();
	}
	
	protected boolean isLabor() {
		return true;
	}
}
