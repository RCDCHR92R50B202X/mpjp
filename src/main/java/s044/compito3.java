package s044;

public class compito3 {
	public static void main(String[] args) {
		int[] data = { 5, 1, 7, 3, 4 };
		boolean one = false;
		boolean seven = false;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == 1) {
				System.out.println("1 è in posizione " + i);
				one = true;
			}

		}
		if (one == false) {
			System.out.println("not found 1");
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] == 7) {
				System.out.println("7 è in posizione " + i);
				seven = true;
			}

		}
		if (seven == false) {
			System.out.println("not found 7");
		}

	}
}