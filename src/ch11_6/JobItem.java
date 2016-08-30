package ch11_6;

public class JobItem {

	private int _unitPrice;
	private int _quantity;
	protected Employee _employee;
	
	protected JobItem(int unitPrce, int quantity) {
		_unitPrice = unitPrce;
		_quantity = quantity;
	}
	
	public int getUnitPrice() {
		return _unitPrice;
	}
	
	public int getQuantity() {
		return _quantity;
	}
	
	protected boolean isLabor() {
		return false;
	}
}
