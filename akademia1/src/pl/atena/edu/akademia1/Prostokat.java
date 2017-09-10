/**
 * 
 */
package pl.atena.edu.akademia1;
import java.util.Scanner;

/**
 * @author ewalu1
 *
 */
public class Prostokat {

	/**
	 * @param args
	 */
	private static Scanner scanner = new Scanner(System.in);
	
	public static final double MIN = 1;
	public static final double MAX = 10;
	
	
	/**
	 * @param liczba
	 * @param komunikat
	 * @return
	 * metoda sprawdza, czy liczba jest z zakresu 1..10, zwraca true, lub false+komunikat
	 */
	public static boolean sprawdz (double liczba, String komunikat) {
		if (!(liczba>=MIN && liczba<=MAX)) {
			System.out.println("Liczba " + komunikat + " jest spoza zakresu [1,10]");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Podaj d�ugo�� boku a:");
		String sa = scanner.nextLine();
		
		System.out.println("Podaj d�ugo�� boku b:");
		String sb = scanner.nextLine();
		
		double a = Double.valueOf(sa);
		
		/*try {
			a = Double.valueOf(sa);
		} catch (Exception e) {
			System.out.println("A nie jest liczb�.");
		}*/
		
		double b = Double.valueOf(sb);
		
		boolean testA = sprawdz(a,"a"); //sprawdzenie i wy�wietlnie komunikatu
		boolean testB = sprawdz(b,"b");
		
		if (testA && testB) {
			double pole = a*b;
			System.out.println("Pole = "+pole);
		}

	}

}
