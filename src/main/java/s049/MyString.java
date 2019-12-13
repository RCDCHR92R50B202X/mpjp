package s049;

public class MyString {
	static int compareTo(String s, String t) {
		int lengths = s.length();
		int length = t.length();
		int minlength = 0;

		if (lengths < length) {
			minlength = lengths;
		} else {
			minlength = length;
		}

		for (int i = 0; i < minlength; i++) {
			if (s.charAt(i) < t.charAt(i)) {
				return (-1);
			} else if (s.charAt(i) > t.charAt(i)) {
				return (1);
			}
		}

		if (length == lengths) {
			return 0;
		} else if (lengths < length) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {

		String s1 = "hello";
		String t1 = "world";

		int result = compareTo(s1, t1);
		System.out.println("hello vs world, result is: " + result);

		String s2 = "hello";
		String t2 = "hello";

		int result2 = compareTo(s2, t2);
		System.out.println("hello vs world, result is: " + result2);

		String s3 = "hello";
		String t3 = "hell";

		int result3 = compareTo(s3, t3);
		System.out.println("hello vs hell, result is: " + result3);

	}
}