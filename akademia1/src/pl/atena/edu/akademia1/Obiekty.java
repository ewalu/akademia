package pl.atena.edu.akademia1;

public class Obiekty {

	public static void main(String[] args) {
		Osoba osoba1 = new Osoba();
		Osoba osoba2 = new Osoba(23);
		Osoba osoba3 = new Osoba(23,180);
		Osoba osoba4 = new Osoba("Ewa","£ugin", 12, 60);
		Osoba osoba5 = Osoba.instance("Jan");
		
		osoba5.dodajLat(3);
		
		System.out.println(osoba1);
		System.out.println(osoba2);
		System.out.println(osoba3);
		System.out.println(osoba4);
		System.out.println(osoba5);
		
		System.out.println(osoba2.pelnoletni());

	}

}
