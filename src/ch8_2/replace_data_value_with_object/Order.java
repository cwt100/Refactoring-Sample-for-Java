package ch8_2.replace_data_value_with_object;

import java.util.Collection;
import java.util.Iterator;

public class Order {

	private Customer _customer;
	
	public Order (String customerName) {
		_customer = new Customer(customerName);
	}
	
	public String getCustomerName() {
		return _customer.getName();
	}
	
	public void setCustomer(String customerName) {
		_customer = new Customer(customerName);
	}
	
	private static int numberOfOrdersFor(Collection orders, String customerName) {
		
		int result = 0;
		Iterator iter = orders.iterator();
		while(iter.hasNext()) {
			Order each = (Order) iter.next();
			if (each.getCustomerName().equals(customerName)) {
				result ++;
			}
		}
		return result;
	}
}