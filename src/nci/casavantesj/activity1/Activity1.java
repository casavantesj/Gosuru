package nci.casavantesj.activity1;

import java.util.Random;

public class Activity1 {

	public Integer generateRandom() {
		Random number = new Random();
		Integer mod = ((number.nextInt() % 80) + 1);

		return Math.abs(mod);
	}

	public Integer generateReverseNum(int number) {
		Integer var = number / 10;
		Integer mod = number % 10;

		if (number > 9) {
			Integer reverseNum = (mod * 10) + var;
			return reverseNum;
		}
		return number;
	}

	public boolean isPalindrome(Integer number, Integer reverseNum) {
		return number.equals(reverseNum);
	}

	public int add(Integer number, Integer reverseNum) {
		return number + reverseNum;
	}
	
	public int builPalindrome(int val) {
		int rev = generateReverseNum(val);
		if (isPalindrome(val, rev))
			return val;
		return add(val,rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity1 act = new Activity1();
		int number = act.generateRandom();
		System.out.println(number);
		// int reverse = act.generateReverseNum(number);
		// act.isPalindrome(number, reverse);
		// while(!act.isPalindrome(number, reverse)) {
		// int result = act.add(number, reverse);
		// System.out.println(number + reverse == result);
		// number = reverse;
		// reverse = result;
	}
	// System.out.println(reverse);
	
	


}

// }
