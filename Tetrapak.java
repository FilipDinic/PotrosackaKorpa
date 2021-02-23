package januar25;

public class Tetrapak extends Ambalaza {
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean reciklaza;
	private double osnovnaCena;

	public Tetrapak() {

	}

	public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean reciklaza, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;

	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.reciklaza) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else
			return this.osnovnaCena;
	}

	@Override
	public void stampa() {
		System.out.println("ID proizvoda: " + this.barkod + ", " + "Naziv proizvoda: " + this.naziv);
		System.out.println("Neto tezina: " + this.neto + ", " + "Bruto tezina: " + this.bruto + ", " + "Reciklaza: " + this.reciklaza + ", " + "Osnovna cena: " + this.osnovnaCena);
	}
}
