package ex;

public class S60 {

	public static <s> String reverse(String s) {

		StringBuilder t = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {

			t.append(s.charAt(i));
		}

		return t.toString();
	}

	public static boolean isPalindrome(String s) {

		int len = s.length();

		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static String removeVowels(String s) {
		StringBuilder t = new StringBuilder();
		int len = s.length();

		for (int i = 0; i < len; i++) {
			if ((s.charAt(i) != 'a') && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o')
					&& (s.charAt(i) != 'u')) {

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

	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		for (int i = data.length - 1, j = 0; i >= 0; i--) {

			result[j] = data[i];

		}

		return result;
	}

	public static double average(int[] data) {
		double sum = 0;

		for (int cur : data) {

			sum += cur;

		}

		double result = sum / data.length;
		return result;
	}

	public static int max(int[] data) {

		int result = Integer.MIN_VALUE;

		for (int i = 0; i < data.length; i++) {
			if (data[i] > result) {
				result = data[i];
			}
		}

		return result;
	}
}
