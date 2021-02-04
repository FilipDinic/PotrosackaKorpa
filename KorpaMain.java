package januar25;

public class KorpaMain {

	public static void main(String[] args) {
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza 
//razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		//Korpa k = new Korpa();

		Tetrapak a = new Tetrapak("123-321", "Mleko", 1000, 1100, false, 100);

		StaklenaAmbalaza b = new StaklenaAmbalaza("789-987", "Flasa", 0.7, 0.5, 20, true, 65);

		SuperKartica c = new SuperKartica("123-456-789", "Filip Dinic", 100);

		Korpa d = new Korpa();
		
		a.stampa();
		b.stampa();
		
		d.dodajAmbalazu(a);
		d.dodajAmbalazu(b);
		
		System.out.println(d.cenaKorpe(c));
	}
}
