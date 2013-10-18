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
	
	@Test
	public void testReverseNumber() {
		Activity1 activity = new Activity1();
		int reverseNum = activity.generateReverseNum(32);
		assertTrue("Random generated is not reverse " + reverseNum, reverseNum == 23);
		reverseNum = activity.generateReverseNum(4);
		assertTrue("Random generated is not reverse " + reverseNum, reverseNum == 4);
		reverseNum = activity.generateReverseNum(10);
		assertTrue("Random generated is not reverse " + reverseNum, reverseNum == 1);
	}

	@Test
	public void testAdd() {
		Activity1 activity = new Activity1();
		int added = activity.add(32, 23);
		assertTrue("Wrong addition " + added, added == 23 + 32);
	}
	
	@Test
	public void testResult() {
		Activity1 activity = new Activity1();
		int palin = activity.builPalindrome(5);
		assertTrue("Is not palindrome " + palin, palin == 5);
		palin = activity.builPalindrome(25);
		assertTrue("Is not palindrome " + palin, palin == 25 + 52);
	}
	
	
}
