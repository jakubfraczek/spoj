package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeGenerator {
	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String line = buf.readLine();
			int lines = Integer.parseInt(line);

			for (int i = 0; i < lines; i++) {
				line = buf.readLine();
				String[] dupa = line.split(" ", 2);
				int a = Integer.parseInt(dupa[0]);
				int b = Integer.parseInt(dupa[1]);
				if (a <= 2){
					//http://www.algorytm.edu.pl/algorytmy-maturalne/sito-eratostenesa.html
//					https://pl.wikipedia.org/wiki/Sito_Eratostenesa
				}
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}