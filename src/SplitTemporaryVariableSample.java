
public class SplitTemporaryVariableSample {
	
	static double _primaryForce;
	static double _secondaryForce;
	static double _mass;
	
	static int _delay;
	
	public static void main(String args[]) {
		
		_primaryForce = 100;
		_secondaryForce = 200;
		_mass = 10;
		_delay = 10;
		double distanceTravelled = getDistanceTravelled(5);
		System.out.println("RESULT: " + distanceTravelled);
	}
	
	private static double getDistanceTravelled(int time) {
		double result;
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime *primaryTime;
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primaryVal = primaryAcc * _delay;
			final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVal * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
