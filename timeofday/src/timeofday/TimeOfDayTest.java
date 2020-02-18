package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	
	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(18,45);
		assert myTimeOfDay.getHours() == 18;
		assert myTimeOfDay.getMinutes() == 45;
	}

}