package pl.atena.edu.akademia1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MagicSquare {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Podaj wymiar kwadratu");
		int wymiar = scanner.nextInt();
		int [][] kwadrat = new int[wymiar][wymiar];
		int [] sumy = new int [kwadrat.length*2+2];
		
		for(int i=0; i<sumy.length; i++) {
			sumy[i] = 0;
			
		}
		System.out.println("Podaj kwadrat");
		for (int i=0; i<kwadrat.length; i++) {
			for (int j=0; j<kwadrat.length; j++) {
			kwadrat[i][j] = scanner.nextInt();
			
			}
		}
		
		for (int i=0; i<kwadrat.length; i++) {
			for (int j=0; j<kwadrat.length; j++) {
			//kwadrat[i][j] = generator.nextInt(9);
			//kwadrat[i][j] = 2;
			System.out.printf("%4d",kwadrat[i][j]);
			}
			System.out.println();
			
		}
		
		for (int i=0; i<kwadrat.length; i++) {
			sumy[0]+=kwadrat[i][i];//przek¹tna 1
			sumy[1]+=kwadrat[kwadrat.length-i-1][i];//przek¹tna 2
			for (int j=0; j<kwadrat.length; j++) {
				sumy[j+2]+=kwadrat[i][j];//kolumny
				sumy[j+2+kwadrat.length]+=kwadrat[j][i];//wiersze

			}
		}
		int suma = 0;
		for (int i = 0; i<sumy.length; i++)	{
			suma+=sumy[i];
			System.out.print(sumy[i]+" ");
			
		}
		
		if (suma/sumy.length == sumy[0]) {
			System.out.println("Kwadrat jest magiczny");
		}
		else System.out.println("Kwadrat nie jest magiczny");

	}
}
