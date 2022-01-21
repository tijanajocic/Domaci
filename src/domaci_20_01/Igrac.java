package domaci_20_01;

public class Igrac extends Osoba {
	private int brojKojiOsobaNosi;
	private String pozicija;
	private boolean daLiJeKapiten;

	public Igrac() {

	}

	public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int brojKojiOsobaNosi, String pozicija,
			boolean daLiJeKapiten) {
		super(imeIprezime, jmbg, godinaRodjenja);
		this.brojKojiOsobaNosi = brojKojiOsobaNosi;
		this.pozicija = pozicija;
		this.daLiJeKapiten = daLiJeKapiten;
	}

	@Override
	public void stampaj() {
		System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", "
				+ this.brojKojiOsobaNosi + ", " + this.pozicija + ", " + this.daLiJeKapiten);
	}

}

//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
