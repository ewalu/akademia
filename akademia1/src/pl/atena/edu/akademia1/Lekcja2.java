package pl.atena.edu.akademia1;

import java.util.Scanner;

public class Lekcja2 {

	public static void main(String[] args) {
		String tekst = "aaaaaaa \n 79797hhhhhhhhhh";
		Scanner scanner = new Scanner(tekst);
		System.out.println("aaaa " + scanner.hasNext());
		System.out.println("nnn " + scanner.nextLine());
		System.out.println("nnn " + scanner.nextLine());

		System.out.println(1000.0/3.0);
		System.out.printf("%8.2f\n",1000.0/3.0);
		System.out.printf("%.2f\n",1000.0/3.0);
		System.out.printf("%+.4f\n",1000.0/3.0);
		
		String ss = String.format("%s %d","eeee",444);
		System.out.println(ss);
		
		scanner.close();
		

	}

}
