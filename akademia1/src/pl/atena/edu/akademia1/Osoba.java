package pl.atena.edu.akademia1;

public class Osoba {
	public static final int PELNOLETNOSC = 18;
	private String imie;
	private String nazwisko;
	private int wiek;
	private int wzrost;
	private Zwierze zwierze;
	
	public static class Zwierze {
		private String gatunek;
		private String imie;
		public Zwierze (String gatunek) {
			this.gatunek = gatunek;
		}
		
		public Zwierze (String gatunek, String imie) {
			this(gatunek);
			this.imie = imie;
		}
		
		public String toString() {
			return String.format("Zwierze [gatnek=%s, imie=%s]", gatunek, imie);
		}
	}
	
	public void dodajZwierze(String gatunek) {
		zwierze = new Zwierze(gatunek);
	}
	
	public void dodajZwierze(String gatunek, String imie) {
		zwierze = new Zwierze(gatunek, imie);
	}
	
	public void wyswietlZwierze() {
		System.out.print(this+" posiada ");
		System.out.println(zwierze);
	}
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

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public int getWzrost() {
		return wzrost;
	}

	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	public static int getPelnoletnosc() {
		return PELNOLETNOSC;
	}


	
	

}
