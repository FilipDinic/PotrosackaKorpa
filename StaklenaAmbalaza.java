package januar25;

public class StaklenaAmbalaza extends Ambalaza {
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

	private double kaucija;
	private boolean daLiSePlaca;
	private double osnovna;

	public StaklenaAmbalaza() {

	}

	public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, double kaucija, boolean daLiSePlaca, double osnovna) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.daLiSePlaca = daLiSePlaca;
		this.osnovna = osnovna;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSePlaca() {
		return daLiSePlaca;
	}

	public void setDaLiSePlaca(boolean daLiSePlaca) {
		this.daLiSePlaca = daLiSePlaca;
	}

	public double getOsnovna() {
		return osnovna;
	}

	public void setOsnovna(double osnovna) {
		this.osnovna = osnovna;
	}

	@Override
	public double cenaArtikla() {
		boolean k = true;
		if (k) {
			return this.osnovna * 1.2 + this.kaucija;
		}
		return this.osnovna * 1.2;
	}

	@Override
	public void stampa() {
		System.out.println("ID proizvoda: " + this.barkod + ", " + "Naziv proizvoda: " + this.naziv);
		System.out.println("Neto tezina: " + this.neto + ", " + "Bruto tezina: " + this.bruto + ", " + "Kaucija: " + this.kaucija + ", " + "Da li se placa: " + this.daLiSePlaca + ", " + "Osnovna cena: " + this.osnovna);
	}
}
