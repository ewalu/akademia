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
	
	public static void main(String[] args) {
		
		System.out.println("Podaj d³ugoœæ boku a:");
		String sa = scanner.nextLine();
		
		System.out.println("Podaj d³ugoœæ boku b:");
		String sb = scanner.nextLine();
		
		double a = 0;
		
		try {
			a = Double.valueOf(sa);
		} catch (Exception e) {
			System.out.println("A nie jest liczb¹.");
		}
		
		double b = Double.valueOf(sb);
		
		double pole = a*b;
		
		//System.out.println("D³ugoœæ boku a = "+a);
		//System.out.println("D³ugoœæ boku b = "+b);
		System.out.println("Pole = "+pole);

	}

}
