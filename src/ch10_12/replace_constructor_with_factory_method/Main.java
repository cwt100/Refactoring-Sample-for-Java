package ch10_12.replace_constructor_with_factory_method;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = Employee.create(Employee.ENGINNER);
		System.out.println("EMPLOYEE: " + employee.toString());
	}
}
