/**
 * 
 */
package pl.atena.edu.akademia1;
import java.util.Scanner;

/**
 * @author ewalu1
 *
 */
public class Okrag {

	/**
	 * @param args
	 */
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Podaj promieñ okrêgu:");
		String sp = scanner.nextLine();
		
		double promien = Double.valueOf(sp);
		//final double pi = 3.14; //sta³a
		double pole = Math.PI*Math.pow(promien, 2);
		System.out.println("Pole = "+pole);

	}

}
