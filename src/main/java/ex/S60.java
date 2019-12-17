package ex;

public class S60 {
	/**
	 * Reverse a string
	 * 
	 * @param <s>
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static <s> String reverse(String s) {

		StringBuilder t = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {

			t.append(s.charAt(i));
		}

		return t.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {

		int len = s.length();

		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder t = new StringBuilder();
		int len = s.length();

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) != 'a') {
			} else if (s.charAt(i) != 'e') {
			} else if (s.charAt(i) != 'i') {
			} else if (s.charAt(i) != 'o') {
			} else if (s.charAt(i) != 'u') {
			} else {
				t.append(s.charAt(i));
			}

		}
		return t.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		// TODO

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		return 0;
	}
}
