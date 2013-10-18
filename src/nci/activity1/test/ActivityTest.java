package nci.activity1.test;

import static org.junit.Assert.assertTrue;
import nci.casavantesj.activity1.Activity1;

import org.junit.Test;

public class ActivityTest {

	@Test
	public void testRandomGenerator() {
		Activity1 activity = new Activity1();
		int ran = activity.generateRandom();
		assertTrue("Random generated out of bounds " + ran, ran > 0 && ran <= 80);
		int ran2 = activity.generateRandom();
		assertTrue("Random generated is equal to previous " + ran, ran2 != ran);
		
	}

}
