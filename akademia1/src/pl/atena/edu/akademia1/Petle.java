package pl.atena.edu.akademia1;

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

	}

}
