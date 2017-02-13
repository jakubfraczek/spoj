package primeGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] primesArray = new int[4000];

		int primeIndex = 0;
		primesArray[primeIndex++] = 2;
		for (int i = 3; i < 32000; i += 2) {
			boolean flag = true;
			double limes = Math.sqrt(i);

			for (int j = 0; j < primesArray.length; j++) {
				if (j > limes) {
					break;
				}

				if (primesArray[j] != 0 && i % primesArray[j] == 0) {
					flag = false;
					break;
				}

			}
			if (flag) {
				primesArray[primeIndex++] = i;
			}
		}

		int t = in.nextInt();

		for (int index = 0; index < t; index++) {
			int m = in.nextInt();
			int n = in.nextInt();

			boolean[] isPrime = new boolean[n - m + 1];
			Arrays.fill(isPrime, true);

			int o = n;
			if (m < 2) {
				o = n - m;
				m = 2;
			}
			for (int i = m; i <= n; i++) {
				double limes = Math.sqrt(i);

				for (int j = 0; j < primesArray.length; j++) {
					if (j > limes) {
						break;
					}

					if (primesArray[j] != i && primesArray[j] != 0 && i % primesArray[j] == 0) {
						isPrime[i - m] = false;
						break;
					}

				}
			}

			for (int p = 0; p <= o - m; p++) {
				if (isPrime[p]) {
					System.out.println(p + m);
				}
			}
		}
		in.close();
	}

}
