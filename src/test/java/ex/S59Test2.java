package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class S59Test2 {

	@Test
	void multiplicationTablePlain() {
		int[][] actual = S59.multiplicationTable(3);

		int[][] expected = new int[][] { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };

		assertEquals(expected.length, actual.length);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i].length, actual.length);

		}

		for (int i = 0; i < expected.length; i++) {
			for (int j = 0; j < expected.length; j++) {
				assertEquals(expected[i][j], actual[i][j]);

			}
		}

	}

}
