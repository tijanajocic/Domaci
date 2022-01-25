package domaci_24_01;

public class Tetrapak extends Ambalaza {

	private boolean recikliranje;
	private double osnovnaCena;

	public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean recikliranje,
			double cena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.recikliranje = recikliranje;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isRecikliranje() {
		return recikliranje;
	}

	public void setRecikliranje(boolean recikliranje) {
		this.recikliranje = recikliranje;
	}

	public double getosnovnaCena() {
		return osnovnaCena;
	}

	public void setCena(double cena) {
		this.osnovnaCena = osnovnaCena;
	}

	public double vracaCenu() {
		double cena;
		if (recikliranje == true) {
			cena = racunaTezinu() * 1.5 + (this.osnovnaCena);
		} else {
			cena = osnovnaCena;
		}

		return cena;
	}

	@Override
	public void stampaj() {
		System.out.println(super.getNazivArtikla() + super.getBarkod() + super.getBrutoTezina() + super.getNetoTezina()
				+ this.osnovnaCena + this.recikliranje);
	}

}


//
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
//
