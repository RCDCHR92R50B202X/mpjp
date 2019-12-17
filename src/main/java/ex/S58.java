package ex;

public class S58 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {

		if (value == 0) {
			return "zero";
		} else if (value < 0) {
			return "negative";
		} else {
			return "positive";
		}

	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		switch (value) {
		case 0:
			return "0";
		case 1:
			return "1";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		default:
			return "other";

		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {

		if (percentile > 90) {
			return 'A';
		} else if (percentile <= 90 && percentile > 80) {
			return 'B';
		} else if (percentile <= 80 && percentile > 70) {
			return 'C';
		} else if (percentile <= 70 && percentile > 60) {
			return 'D';
		} else if (percentile <= 60 && percentile > 50) {
			return 'E';
		}

		else {
		}
		return 'F';
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if ((year % 4 == 0) && !(year % 100 == 0)) {

			return true;
		} else {
			return false;
		}

	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];

		if (a < b) {
			if (c < a) {
				result[0] = c;
				result[1] = a;
				result[2] = b;
			} else if (c > b) {
				result[0] = a;
				result[1] = b;
				result[2] = c;
			} else {
				result[0] = a;
				result[1] = c;
				result[2] = b;
			}
		}
		if (a > b) {
			if (c > a) {
				result[0] = b;
				result[1] = a;
				result[2] = c;
			} else if (c < b) {
				result[0] = c;
				result[1] = b;
				result[2] = a;
			} else {
				result[0] = a;
				result[1] = b;
				result[2] = c;
			}
		}
		
		return result;
	}
}