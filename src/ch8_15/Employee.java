package ch8_15;

public class Employee {
	
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
		_type = EmployeeType.newType(type);
	}
	
	int payAmount() {
		switch (_type.getTypeCode()) {
		case EmployeeType.ENGINNER:
			return _monthlySalary;
		case EmployeeType.SALESMAN:
			return _monthlySalary + _commission;
		case EmployeeType.MANAGER:
			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}
}
