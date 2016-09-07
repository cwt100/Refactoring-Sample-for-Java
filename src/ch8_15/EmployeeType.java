package ch8_15;

abstract class EmployeeType {
	
	static final int ENGINNER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	abstract int getTypeCode();
	abstract int payAmount(Employee employee);
	
	static EmployeeType newType(int code) {
		switch (code) {
		case ENGINNER:
			return new Enginner();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalArgumentException("Incorrect Employee Code");
		}
	}
}
