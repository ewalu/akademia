package pl.atena.edu.akademia1;

import java.util.ArrayList;
import java.util.Random;

public class MagicSquare {

	public static void main(String[] args) {
		int [][] kwadrat = new int[3][3];
		int [] sumy = new int [kwadrat.length*2+2];
		Random generator = new Random();
		
		for(int i=0; i<sumy.length; i++) {
			sumy[i] = 0;
			
		}
		
		for (int i=0; i<kwadrat.length; i++) {
			for (int j=0; j<kwadrat.length; j++) {
			//kwadrat[i][j] = generator.nextInt(9);
			kwadrat[i][j] = 2;
			System.out.print(kwadrat[i][j]);
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
		}
		
		if (suma/sumy.length == sumy[0]) {
			System.out.println("Kwadrat jest magiczny");
		}
		else System.out.println("Kwadrat nie jest magiczny");

	}
}
