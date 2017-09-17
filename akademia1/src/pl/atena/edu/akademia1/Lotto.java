package pl.atena.edu.akademia1;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		ArrayList<Integer> liczby;
		ArrayList<Integer> wynik;
		liczby = new ArrayList<>();
		wynik = new ArrayList<>();
		for (int i = 1; i<=49; i++)
		{
			liczby.add(i);
		}
		
		Random wsk = new Random();
		int a;
		
		for (int j = 1; j<=6; j++)
		{
			a = wsk.nextInt(liczby.size());
			wynik.add(liczby.get(a));
			liczby.remove(a);
		}
		System.out.println(wynik);
		
	}

}
