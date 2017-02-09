package spoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeGenerator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("liczba linii");
		int a = sc.nextInt();

		List<Integer> primesList = new ArrayList<Integer>();
		boolean[] primesArray = new boolean[10000000];

		for (int i = 2; i < primesArray.length; i++) {
			primesArray[i] = true;
		}
		int max = 10000000;
		double n = Math.sqrt(max);
		
		for (int i = 2; i < n; i++) {
			for (int j = i * i; j < max; j += i) {
				primesArray[j] = false;
			}
		}
		
		for (int i = 31623; i < 10000000; i++){
			primesArray[i] = false;
		}

		for (int i = 2; i < primesArray.length; i++) {
			if(primesArray[i]){
				primesList.add(i);
			}
		}
//		int index = 0;
//		for(int p : primesList){
//			System.out.println("Index: " + index + ", value: " + p);
//			index++;
//		}
		
		for (int i = 0; i < a; i++) {
			System.out.println("zakres");
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (b<2){
				b = 2;
			}
			for (int j = b; j <= c; j++){
				int dupa = 0;
				if(primesList.contains(j)){
					dupa = primesList.indexOf(j);
					System.out.println(primesList.get(dupa));
				}
			}

		}

		sc.close();
	}

}