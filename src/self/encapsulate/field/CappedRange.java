package self.encapsulate.field;

public class CappedRange extends IntRange {

	private int _cap;
	
	public CappedRange(int low, int high, int cap) {
		super(low, high);
		_cap = cap;
	}
	
	public int getCap() {
		return _cap;
	}

	@Override
	public int getHigh() {
		return Math.min(super.getHigh(), getCap());
	}
}
