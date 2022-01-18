package domaci_17_01;

public class Transakcija {
	
	
	private int idTransakcije;
	private double racunSaKogaSeSalje;
	private double racunNaKojiSeSalje;

	public Transakcija(int idTransakcije, int racunSaKogaSeSalje, int racunNaKojiSeSalje) {
		this.idTransakcije = idTransakcije;
		this.racunNaKojiSeSalje = racunNaKojiSeSalje;
		this.racunSaKogaSeSalje = racunSaKogaSeSalje;
	}

	public int getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(int idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public double getRacunSaKogaSeSalje() {
		return racunSaKogaSeSalje;
	}

	public void setRacunSaKogaSeSalje(double racunSaKogaSeSalje) {
		this.racunSaKogaSeSalje = racunSaKogaSeSalje;
	}

	public double getRacunNaKojiSeSalje() {
		return racunNaKojiSeSalje;
	}

	public void setRacunNaKojiSeSalje(double racunNaKojiSeSalje) {
		this.racunNaKojiSeSalje = racunNaKojiSeSalje;
	}

	private double provizijaa(double visinaTransakcije) {
		double provizija = 0;
		if (visinaTransakcije < 4500) {
			return provizija = 45;
		} else {
			return provizija = 0.01 * visinaTransakcije;
		}

	}

	public void izvrsiTransakciju(int vrednostKojaSePrebacuje) {

		racunSaKogaSeSalje = racunSaKogaSeSalje - vrednostKojaSePrebacuje + provizijaa(vrednostKojaSePrebacuje);
		racunNaKojiSeSalje = racunNaKojiSeSalje + vrednostKojaSePrebacuje;
	}
}

//
//Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se 
//racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1% 
//S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda 
//prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte
//fiksnu proviziju u vrednosti od 45.
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//a na drugi racun dodaje samo (trazena suma).


