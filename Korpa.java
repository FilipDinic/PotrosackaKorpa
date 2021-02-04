package januar25;

import java.util.ArrayList;

public class Korpa {
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju 
//treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar 
//prima popust. 
//metodu koja racuna i vraca ukupnu cenu korpe (sabira sve cene ambalze), 
//kao parametar funkcije se prima Super karticu iz koje se cita popust.

	private ArrayList<Ambalaza> niz;

	public Korpa() {
		this.niz = new ArrayList<Ambalaza>();
	}
	
	public ArrayList<Ambalaza> getNiz() {
		return niz;
	}

	public void setNiz(ArrayList<Ambalaza> niz) {
		this.niz = niz;
	}

	public void dodajAmbalazu(Ambalaza a) {
		niz.add(a);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < niz.size(); i++) {
			Ambalaza a = this.niz.get(i);
			if (barkod.equals(this.niz.get(i))) {
				this.niz.remove(i);
			}
		}
	}
	
	private double vratiCenuAmbalazaSaPopustom(double popust) {
		double cenapopust = 0;
		double suma = 0;
		for (int i = 0; i < niz.size(); i++) {
			suma = suma + this.niz.get(i).cenaArtikla();
			cenapopust = suma - popust;
		}
		return cenapopust;
	}

	public double cenaKorpe(SuperKartica p) {
		double popust = p.getPopust();
		double cena = this.vratiCenuAmbalazaSaPopustom(popust);
		return cena;
	}
}
