package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {
/*	
	@Test
	void testGetTotalSecondsGood() {
	int seconds = 
	Time.getTotalSeconds("05:05:05");
	assertTrue("The seconds were not calculated  properly", seconds==18305);;
	}
	
	@Test
	void testGetTotalSecondsBad() {
	assertThrows(
	StringIndexOutOfBoundsException.class, 
	()-> {Time.getTotalSeconds("10:00");});
	}

	
	@Test
	void testGetTotalSecondsBoundary() {
		int seconds = Time.getTotalSeconds("59:59:59");
		assertTrue("The seconds were not calculated  properly", seconds==215999);
	}

	@Test
	void testGetSecondsGood() {
		int seconds = Time.getSeconds("05:05:05");
		assertTrue("The seconds were not calculated  properly", seconds==05);;
	}

	@Test
	void testGetSecondsBad() {
			assertThrows(
	StringIndexOutOfBoundsException.class, 
	()-> {Time.getTotalSeconds("10:00");});
	}

	@ParameterizedTest
	@ValueSource(strings = { "00:00:17", "30:30:17", 
	"59:59:17" })
	
	void testGetSecondsBoundary(String candidate) {
		int seconds = Time.getSeconds(candidate);
		assertTrue("The seconds were not calculated  properly", seconds==17);
	}

	@Test
	void testGetTotalMinutesGood() {
		int minutes = Time.getTotalMinutes("06:15:05");
		assertTrue("The minutes were not calculated  properly", minutes==15);;
	}

	@Test
	void testGetTotalMinutesBad() {
			assertThrows(
	StringIndexOutOfBoundsException.class, 
	()-> {Time.getTotalSeconds("10");});
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "00:30:00", "30:30:30", 
	"59:30:59" })
	
	void testGetTotalMinutesBoundary(String candidate) {
		int minutes = Time.getTotalMinutes(candidate);
		assertTrue("The minutes were not calculated  properly", minutes==30);
	}

	@Test
	void testGetTotalHoursGood() {
		int hours = Time.getTotalHours("09:05:05");
		assertTrue("The hours were not calculated  properly", hours==9);;
	}
	
	@Test
	void testGetTotalHoursBad() {
			assertThrows(
	NumberFormatException.class, 
	()-> {Time.getTotalSeconds("bob");});
	}

	@ParameterizedTest
	@ValueSource(strings = { "07:00:00", "07:30:59", 
	"07:59:59" })

	void testGetTotalHoursBoundary(String candidate) {
		int hours = Time.getTotalHours(candidate);
		assertTrue("The hours were not calculated  properly", hours==7);
	}
	
	@Test
	void testGetMilliseconds() {
	int milliseconds = 
	Time.getMilliseconds("10:10:10:005");
	assertTrue("The milliseconds were not calculated  properly", milliseconds==5);;
	}
	
	void testGetMillisecondsBad() {
		assertThrows(
				StringIndexOutOfBoundsException.class, 
				()-> {Time.getMilliseconds("01:01:01:05");});
		}
	
	@Test
	void testGetMillisecondsBoundary() {
		int milliseconds = Time.getMilliseconds("99:99:99:999");
		assertTrue("The milliseconds were not calculated  properly", milliseconds==999);
	}
*/
}
