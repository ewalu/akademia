package pl.atena.edu.akademia1;

import java.util.ArrayList;
import java.util.Random;

public class Zadanie1 {

	public static void main(String[] args) {
		//lista liczb
		ArrayList<Integer> liczby;
		liczby = new ArrayList<>();
		Random generator = new Random();
		int iteracje = 1;
		
		//generujê pierwsz¹ liczbê i podstawiam pod max, min i sumê
		liczby.add(generator.nextInt(100));
		int max = liczby.get(0);
		int min = liczby.get(0);
		float suma = liczby.get(0);
		
		do {
			liczby.add(generator.nextInt(100));
			//dodajê do sumy kolejne liczby
			suma+=liczby.get(iteracje);
			
			//spradzam czy kolejna liczba jest >max, <min
			if (liczby.get(iteracje)>=max) {
				max = liczby.get(iteracje);
			}
			
			if (liczby.get(iteracje)<=min) {
				min = liczby.get(iteracje);
			}
			
			iteracje++;
		} while (iteracje < 5);
		System.out.println(liczby);
		System.out.println("Œrednia = " +suma/iteracje);
		System.out.println("MAX = " +max);
		System.out.println("MIN = " +min);

	}

}
