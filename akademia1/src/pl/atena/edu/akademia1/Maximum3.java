package pl.atena.edu.akademia1;

import java.util.Scanner;

public class Maximum3 {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean wczytanieliczb (int[] liczby) {
		for (int i=0; i<liczby.length; i++) {
			System.out.println("Podaj liczbê ca³kowit¹:");
			String smsc = scanner.nextLine();
			try {
				liczby[i] = Integer.valueOf(smsc);
			} catch (Exception e) {
				System.out.println("To nie jest liczba ca³kowita.");
				return true;
			}
			
		}
		return true;
	}
	
	public static boolean maxliczb (int[] liczby) {
		if (liczby[0] >= liczby [1]) {
			if(liczby[0] >= liczby[2])
			{
				System.out.println("Maximum = "+liczby[0]);
			}
			else {
				System.out.println("Maximum = "+liczby[2]);
			}
		} else if (liczby[1] >= liczby[2])
		{
			System.out.println("Maximum = "+liczby[1]);
		}
		else {
			System.out.println("Maximum = "+liczby[2]);
		}
		return true;
	}


	public static void main(String[] args) {
		int[] liczby = new int[3];
		boolean wynik = wczytanieliczb(liczby);
		boolean wynik2 = maxliczb(liczby);
	}

}
