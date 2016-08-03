
public class ReplaceTempWithQuerySample {
	
	static int _quentity;
	static int _itemPrice;
	
	public static void main(String args[]) {
		
		_quentity = 10;
		_itemPrice = 1000;
		System.out.println("Price: " + getPrice());
	}
	
	private static double getPrice() {
		return basePrice() * discountFactory();
	}
	
	private static int basePrice() {
		return _quentity * _itemPrice;
	}
	
	private static double discountFactory() {
		if (basePrice() > 1000) {
			return 0.95;
		}else {
			return 0.98;
		}
	}
}
