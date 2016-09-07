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
	
	int getMonthlySalary() {
		return _monthlySalary;
	}
	
	int getCommission() {
		return _commission;
	}
	
	int getBonus() {
		return _bonus;
	}
	
	int payAmount() {
		return _type.payAmount(this);
	}
}
