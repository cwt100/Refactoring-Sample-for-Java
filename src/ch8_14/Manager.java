package ch8_14;

//Setp 3: create type code's subclass.
public class Manager extends Employee {

	@Override
	public int getType() {
		return Employee.MANAGER;
	}
}
