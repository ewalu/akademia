package pl.atena.edu.akademia1;

public class tablice {

	public static void main(String[] args) {
		int[] tablica = new int[10];
		
		for (int i=0; i<tablica.length; i++) {
			System.out.println(tablica[i]);
			
		}
		int i = 0;
		for(float item: tablica) {
			System.out.printf("Wartoœæ %d = %f\n", i++, item);
		}
		
		Integer[][] tab1 = {{2,3},{4,5},{1}};
		for (Integer[] kolumna: tab1) {
			for (Integer element: kolumna) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println(tab1[0][1]);
	}

}
