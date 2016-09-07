package ch8_15;

public class Enginner extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.ENGINNER;
	}
	
	@Override
	int payAmount(Employee employee) {
		return employee.getMonthlySalary();
	}

}
