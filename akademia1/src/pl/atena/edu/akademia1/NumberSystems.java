package pl.atena.edu.akademia1;

import java.util.Scanner;

public class NumberSystems {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static boolean systemy (int liczba) {
		String numb1 = Integer.toBinaryString(liczba);
		String numb2 = Integer.toOctalString(liczba);
		String numb3 = Integer.toHexString(liczba);
		System.out.println("Binarnie: "+ numb1);
		System.out.println("Ósemkowo: "+ numb2);
		System.out.println("Szesnastkowo: "+ numb3);
		return true;
	}
	
	public static boolean odwrotnosc (int liczba) {
		if (liczba == 0) {
			System.out.println("Nie mo¿na wyznaczyæ odwrotnoœci 0.");
			return true;
		}
		String numb41 = Double.toHexString(liczba);
		System.out.println("Szesnastkowo odwrotnoœæ: "+ numb41);
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
		
		boolean wynik = systemy(numb);
		boolean wynik2 = odwrotnosc(numb);
	}

}
