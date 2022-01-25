package domaci_24_01;

public class prviZadatak {

	public static void main(String[] args) {

		Korpa korpa1 = new Korpa();
		SuperKartica sk = new SuperKartica(435, "Tijana Jocic", 44);

		korpa1.dodaj(new Tetrapak("2040-20209", "Mleko", 500, 600, true, 100));
		korpa1.dodaj(new Tetrapak("2040-20239", "Cokoladno mleko", 200, 700, false, 90));

		sk.stampaj();

		System.out.println();

		korpa1.stampaj();

		System.out.println("Ukupna cena korpe je: " + korpa1.ukupnaCena(sk));

	}

}


//
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza
//razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
