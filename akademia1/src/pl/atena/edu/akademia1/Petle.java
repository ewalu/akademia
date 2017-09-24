package pl.atena.edu.akademia1;

import java.util.Random;

public class Petle {

	public static void main(String[] args) {
		Integer liczba = Integer.valueOf(2);
		Integer sum = Integer.valueOf(0);
		Integer warunek = Integer.valueOf(100);
		
		while (liczba.compareTo(warunek) <= 0) {
			//System.out.println(liczba);
			sum+=liczba;
			liczba+=2;

		}
		System.out.println("Suma liczba parzystych od 1 do "+warunek+" = " +sum);
		
		Random generator = new Random();
		int iteracje = 0;
		int liczb = 5, los = 0;
		
		do {
			los = generator.nextInt(10);
			iteracje++;
		} while (los != liczb);
		
		System.out.printf("Osi¹gniêto %d w %d", liczb, iteracje);
		System.out.println();
		
		for (char i = 65; i < 91; i++) {
			System.out.print(i+" ");
			
		}

	}

}
