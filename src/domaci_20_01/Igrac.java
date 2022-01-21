package domaci_20_01;

public class Igrac extends Osoba {
	private int brojKojiOsobaNosi;
	private String pozicija;
	private boolean daLiJeKapiten;
	
public Igrac () {
	
}

public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int brojKojiOsobaNosi,String pozicija, boolean daLiJeKapiten) {
	super(imeIprezime, jmbg, godinaRodjenja);
	this.brojKojiOsobaNosi=brojKojiOsobaNosi;
	this.pozicija=pozicija;
	this.daLiJeKapiten=daLiJeKapiten;
}

@Override
public void stampaj () {
	System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", " + this.brojKojiOsobaNosi + ", " + this.pozicija + ", " + this.daLiJeKapiten);
}


	
	




	
}


