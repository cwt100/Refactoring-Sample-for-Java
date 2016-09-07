package ch8_15;

public class Manager extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.MANAGER;
	}

	@Override
	int payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getBonus();
	}
}
