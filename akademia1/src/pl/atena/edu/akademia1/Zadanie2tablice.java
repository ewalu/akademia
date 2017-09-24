package pl.atena.edu.akademia1;

import java.util.Arrays;

public class Zadanie2tablice {

	public static void main(String[] args) {
		int[] tablica = new int[10];
		
		for(int i=0; i<tablica.length; i++) {
			tablica[i] = tablica.length-i-1;
			System.out.printf("dane[%d] = %d\n", i , tablica[i]);
			
		}
		System.out.println(Arrays.toString(tablica));
	}

}
