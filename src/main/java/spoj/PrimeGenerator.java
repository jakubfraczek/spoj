package spoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeGenerator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("liczba linii");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("zakres");
			int b = sc.nextInt();
			int c = sc.nextInt();
			for (int j = b; j <= c; j++) {
				List<Integer> pierwsze = new ArrayList<Integer>();
				for (int x = 1; x <= j; x++) {
					if (j % x == 0) {
						pierwsze.add(j);
					}
				}
				if (pierwsze.size() == 2) {
					System.out.println(j);
				}
			}
		}

	}

}