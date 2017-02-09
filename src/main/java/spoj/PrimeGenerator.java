package spoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeGenerator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		List<Integer> primesList = new ArrayList<Integer>();

		int max = 1000000000;
		double n = Math.sqrt(max);

		primesList.add(2);
		for (int i = 3; i < n; i += 2) {
			boolean flag = true;
			double limes = Math.sqrt(i);
			
			for (int j = 0; j < primesList.size(); j++) {
				if (j > limes){
					break;
				}
				
				if (i % primesList.get(j) == 0){
					flag = false;
					break;
				}

			}
			if (flag){
				primesList.add(i);
			}
		}

		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (b < 2) {
				b = 2;
			}
			for (int j = b; j <= c; j++) {
				int dupa = 0;
				if (primesList.contains(j)) {
					dupa = primesList.indexOf(j);
					System.out.println(primesList.get(dupa));
				}
			}

		}

		sc.close();
	}

}