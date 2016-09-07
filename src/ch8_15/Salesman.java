package ch8_15;

public class Salesman extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.SALESMAN;
	}
	
	@Override
	int payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getCommission();
	}

}
