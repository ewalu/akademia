package pl.atena.edu.akademia1;

public class Osoba {
	public static final int PELNOLETNOSC = 18;
	private String imie;
	private String nazwisko;
	private int wiek;
	private int wzrost;
	
	//konstruktory
	public Osoba() {
		System.out.println("Jestem");
	}
	
	public Osoba(int wiek) {
		this.wiek = wiek;
	}
	
	public Osoba(int wiek, int wzrost) {
		this(wiek); //wywo³uje powy¿szy konstruktor
		this.wzrost = wzrost;
	}
	
	public Osoba(String imie, String nazwisko, int wiek, int wzrost) {
		this(wiek, wzrost);
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	private Osoba(String imie) {
		this.imie = imie;
	}
	
	public static Osoba instance(String imie) {
		return new Osoba(imie);
	}
	
	public void dodajLat(int lata) {
		this.wiek += lata;
	}
	
	public boolean pelnoletni() {
		return this.wiek < PELNOLETNOSC ? false: true;
	}

	@Override //adnotacja nadpisanie
	public String toString() {
		return String.format("Osoba [imie=%s, nazwisko=%s, wiek=%s, wzrost=%s]", imie, nazwisko, wiek, wzrost);
	}


	
	

}
