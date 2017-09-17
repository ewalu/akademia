/**
 * 
 */
package pl.atena.edu.akademia1;

//zaimportowanie klasy Random
import java.util.Random;

/**
 * @author ewalu1
 *
 */
public class WitajSwiecie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double test = 3.14; //sta³a
		int liczba1 = 1, liczba2;
		liczba1++;
		byte bajt1 = 100;
		byte bajt2 = 1;
		byte bajt3 = (byte) (bajt1 + bajt2);
		long liczba3 = 2000L;
		double potega = Math.pow(4, 4);
		char znak = '\u004a';
		//char - pojedyncze nawiasy, string - podwójne
		
		char[] znaki = "Witaj Œwiecie".toCharArray();
		
		for (byte i = 0; i < znaki.length ; i++) {
			System.out.println(znaki[i]);
		}
		System.out.println("\n\n\n\n");
		System.out.println("Witaj");
		System.out.println(znak);
		System.out.println((new Random()).nextInt());
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Double.MIN_VALUE);
		//System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(liczba1);
		System.out.println(bajt3);
		System.out.println(9 % 2);
		System.out.println(Samochod.FIAT);
		//System.out.println(0.0d/0.0d); //NaN
		
		//for (float i = 0; i < 1; i += 0.1) {
			//System.out.println(i);
		//}
		System.out.println("\n");
		String[] tab = {"jeden","dwa"};
		int indeks = 0;
		//najpierw wyœwietla, potem zwiêksza indeks
		System.out.println(tab[indeks++]);
		System.out.println(tab[indeks]);
		
		System.out.println("\n");
		int indeks2 = 0;
		System.out.println(tab[++indeks2]);
		System.out.println(tab[indeks2]);
		
		int test1 = 1000000000*3;
		System.out.println(test1);
		//int test2 = Math.multiplyExact(1000000000,3);//b³¹d przekroczenie zakresu INT
		
		double x = 3.75;
		int n = (int) x;
		System.out.println(n);
		
		char c1 = 'J' + 1;
		System.out.println(c1);
		int i2 = 'J' + 1;
		System.out.println(i2);
		
		byte b = 1, c = 5;
		
		boolean b1 = b <=0 && c>=5;
		boolean b2 = b !=0 || c>5;
		boolean b3 = b>=0;
		
		System.out.println (b1 && b2 || b3);
		
		String test2 = b==0? "zero":"coœ innego";
		System.out.println (test2);
		
	}

}
