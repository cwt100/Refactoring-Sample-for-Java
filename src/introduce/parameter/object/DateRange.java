package introduce.parameter.object;

import java.util.Date;

public class DateRange {

	private final Date _start;
	private final Date _end;

	DateRange(Date start, Date end) {
		_start = start;
		_end = end;
	}

	boolean includes(Date date) {
		boolean result = false;
		if (date.equals(getStart()) || date.equals(getEnd())
				|| (date.after(getStart()) && date.before(getEnd()))) {
			result = true;
		}
		return result;
	}

	Date getStart() {
		return _start;
	}

	Date getEnd() {
		return _end;
	}
}
