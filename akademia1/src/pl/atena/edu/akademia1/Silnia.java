package pl.atena.edu.akademia1;

import java.math.BigInteger;
import java.util.Scanner;

public class Silnia {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean sprawdzenie (int liczba) {
		if (liczba < 0) {
			System.out.println("Nie mo¿na policzyc silni z liczby ujemnej.");
			return true;
		}
		return false;
	}
	
	public static boolean silnia (int liczba) {
		BigInteger silnia = BigInteger.valueOf(1);
			for (int i=1; i <=liczba; i++) {
				silnia = BigInteger.valueOf(i).multiply(silnia);
			}
		System.out.println(liczba+"! = "+silnia);
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
		
		boolean spr = sprawdzenie(numb);
		
		if (spr == false) {
			boolean wynik = silnia(numb);
		}

	}

}
