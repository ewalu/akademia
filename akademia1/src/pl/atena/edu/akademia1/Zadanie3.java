package pl.atena.edu.akademia1;

public class Zadanie3 {

	public static void main(String[] args) {
		int[][] tablica = new int[10][10];
		
		
		
		for(int i = 0; i<tablica.length; i++) {
			tablica[i][i] = 1;
			tablica[tablica.length-i-1][i] = 1;

		}
		
		for (int[] kolumna: tablica) {
			for (int element: kolumna) {
				System.out.print(element + " ");
			}
			System.out.println();

		}
	}

}
