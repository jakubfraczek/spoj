package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeGenerator {
	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String line = buf.readLine();
			int lines = Integer.parseInt(line);

			for (int index = 0; index < lines; index++) {

				int[] tab = null;

				line = buf.readLine();
				String[] dupa = line.split(" ", 2);
				int a = Integer.parseInt(dupa[0]);
				int n = Integer.parseInt(dupa[1]);

				if (a <= 2) {
					a = 2;
					tab = findPrime(n);

				} else {
					tab = findPrime(n);
				}

				for (int t : tab) {
					if (t >= a && t != 0) {
						System.out.println(t);
					}
				}

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	private static int[] findPrime(int n) {
		int[] tab;
		tab = new int[n + 1];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i;
		}

		for (int i = 2; i * i < n; i++) {
			if (tab[i] != 0) {
				int j = i + i;
				while (j < n) {
					tab[j] = 0;
					j += i;
				}
			}
		}
		return tab;
	}

}