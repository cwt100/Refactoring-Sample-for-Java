package self.encapsulate.field;

public class IntRange {

	private int _low, _high;
	
	public IntRange(int low, int high) {
		initial(low, high);
	}
	
	private void initial(int low, int high) {
		_low = low;
		_high = high;
	}
	
	boolean includes (int arg) {
		return arg >= getLow() && arg <= getHigh();
	}
	
	void grow (int factor) {
		setHigh(getHigh() * factor);
	}
	
	public int getLow() {
		return _low;
	}
	
	public void setLow(int low) {
		_low = low;
	}
	
	public int getHigh() {
		return _high;
	}
	
	public void setHigh(int high) {
		_high = high;
	}
}
