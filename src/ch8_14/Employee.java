package ch8_14;

public abstract class Employee {

	static final int ENGINNER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	//Step 5: Define abstract.
	abstract int getType();
	
	//Step 2: factory method.
	static Employee create(int type) {
		//Step 4: create mapping type code's subclass.
		switch (type) {
		case ENGINNER:
			return new Enginner();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalArgumentException("Incorrect type code value.");
		}
	}
	
	//Step 1: encapsulate type code.
}
