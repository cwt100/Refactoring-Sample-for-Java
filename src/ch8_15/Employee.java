package ch8_15;

public class Employee {
	
	static final int ENGINNER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private int _type;
	private int _monthlySalary;
	private int _commission;
	private int _bonus;
	
	Employee(int type) {
		_type = type;
	}
	
	int payAmount() {
		switch (_type) {
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
