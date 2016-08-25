package ch8_2.replace_data_value_with_object;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {

	//preLoad collection.
	private static Dictionary<String, Object> _instances = new Hashtable<String, Object>();
	static void loadCustomers() {
		new Customer("Awa").store();
		new Customer("Jimmy").store();
		new Customer("Cherry").store();
	}
	
	private void store() {
		_instances.put(this.getName(), this);
	}
	
	private final String _name;
	
	/**
	 * factory method replace constructor.
	 * @param name
	 * @return Customer
	 */
	public static Customer getNamed(String name) {
		return (Customer) _instances.get(name);//Use preLoad data.
	}
	
	private Customer(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
}
