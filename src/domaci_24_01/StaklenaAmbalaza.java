package domaci_24_01;

public class StaklenaAmbalaza extends Ambalaza {
	private int kaucija;
	private boolean daLiJePlacenaKaucija;
	private int osnovnaCenaStaklenaAmbalaza;

	public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, int kaucija,
			boolean daLiJePlacenaKaucija, int osnovnaCenaStaklenaAmbalaza) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLiJePlacenaKaucija = daLiJePlacenaKaucija;
		this.osnovnaCenaStaklenaAmbalaza = osnovnaCenaStaklenaAmbalaza;
	}

	public int getKaucija() {
		return kaucija;
	}

	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiJePlacenaKaucija() {
		return daLiJePlacenaKaucija;
	}

	public void setDaLiJePlacenaKaucija(boolean daLiJePlacenaKaucija) {
		this.daLiJePlacenaKaucija = daLiJePlacenaKaucija;
	}

	public int getOsnovnaCenaStaklenaAmbalaza() {
		return osnovnaCenaStaklenaAmbalaza;
	}

	public void setOsnovnaCenaStaklenaAmbalaza(int osnovnaCenaStaklenaAmbalaza) {
		this.osnovnaCenaStaklenaAmbalaza = osnovnaCenaStaklenaAmbalaza;
	}

	@Override
	public double vracaCenu() {
		double cena;
		if (daLiJePlacenaKaucija == true) {
			cena = osnovnaCenaStaklenaAmbalaza * 1.2 + kaucija;
		} else {
			cena = osnovnaCenaStaklenaAmbalaza * 1.2;
		}

		return cena;
	}

	@Override
	public void stampaj() {
		System.out.println(super.getNazivArtikla() + super.getBarkod() + super.getBrutoTezina() + super.getNetoTezina()
				+ this.kaucija + this.osnovnaCenaStaklenaAmbalaza + this.daLiJePlacenaKaucija);
	}

}



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
//
