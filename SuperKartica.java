package januar25;

public class SuperKartica {
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

	private String brojKartice;
	private String ime;
	private double popust;

	public SuperKartica() {

	}

	public SuperKartica(String brojKartice, String ime, double popust) {
		this.brojKartice = brojKartice;
		this.ime = ime;
		this.popust = popust;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void stampa() {
		System.out.println(this.brojKartice + ", " + this.ime);
	}
}
