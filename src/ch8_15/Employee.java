package ch8_15;

public class Employee {
	
	static final int ENGINNER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private EmployeeType _type;
	private int _monthlySalary;
	private int _commission;
	private int _bonus;
	
	Employee(int type) {
		setType(type);
	}
	
	//Step 1: self encapsulate.
	int getType() {
		return _type.getTypeCode();
	}
	
	void setType(int type) {
		switch (type) {
		case ENGINNER:
			_type = new Enginner();
			break;
		case SALESMAN:
			_type = new Salesman();
			break;
		case MANAGER:
			_type = new Manager();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Employee Code");
		}
	}
	
	int payAmount() {
		switch (_type.getTypeCode()) {
		case ENGINNER:
			return _monthlySalary;
		case SALESMAN:
			return _monthlySalary + _commission;
		case MANAGER:
			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}
}
