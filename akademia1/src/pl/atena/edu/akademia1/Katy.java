package pl.atena.edu.akademia1;

import java.util.Scanner;

public class Katy {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean normalize (int liczba) {
		int numb1 = Math.floorMod(liczba, 360);
		System.out.println("Normalizacja: "+ numb1);
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Podaj liczbê ca³kowit¹:");
		String smsc = scanner.nextLine();
		int numb;
		
		try {
			numb = Integer.valueOf(smsc);
		} catch (Exception e) {
			System.out.println("To nie jest liczba ca³kowita.");
			return;
		}
		
		boolean wynik = normalize(numb);

	}

}
