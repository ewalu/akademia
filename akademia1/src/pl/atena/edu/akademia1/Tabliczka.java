package pl.atena.edu.akademia1;

public class Tabliczka {

	public static void main(String[] args) {
		for (int k = 0; k<=10; k++) {
			System.out.printf("%4d", k);
		}
		System.out.println("");
		for (int i = 1; i<=10; i++) {
			System.out.printf("%4d", i);
			for (int j = 1; j<=10; j++) {
				System.out.printf("%4d", i*j);
			}
			System.out.println("");
		}

	}

}
