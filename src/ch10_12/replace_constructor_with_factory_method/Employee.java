package ch10_12.replace_constructor_with_factory_method;

public class Employee {

	private int _type;
	
	static final int ENGINNER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private Employee(int type) {
		_type = type;
	}

	public static Employee create(int type) {
		return new Employee(type);
	}
}
