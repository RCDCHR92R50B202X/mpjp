package ex;

import java.util.ArrayList;

import java.util.Scanner;

public class Esercizio {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String s = scanner.next();
			if (s.equals("exit")) {
				break;
			}
			c.add(s);
		}
		scanner.close();
		System.out.println(c);
	}
}