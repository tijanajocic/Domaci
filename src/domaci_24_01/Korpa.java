package domaci_24_01;

import java.util.ArrayList;

public class Korpa {

	ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

	public void dodaj(Ambalaza ambalaza) {
		nizAmbalaza.add(ambalaza);
	}

	public void disfalifikuj(String barkod) {
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			if (this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				this.nizAmbalaza.remove(i);
			}
		}

	}

	private double cenaSaPopustom(int popust) {
		double racun = 0;
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			racun = nizAmbalaza.get(i).vracaCenu() - (nizAmbalaza.get(i).vracaCenu() * (popust / 100));

		}
		return racun;

	}

	public double ukupnaCena(SuperKartica superKartica) {
		return this.cenaSaPopustom(superKartica.getPopust());

	}

	public void stampaj() {
		System.out.println("Lista artikla u korpi: ");
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			nizAmbalaza.get(i).stampaj();

		}
	}

}


//
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String)
//koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao
//parametar prima popust. 
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao
//parametar funkcije se prima Super karticu iz koje se cita popust.

