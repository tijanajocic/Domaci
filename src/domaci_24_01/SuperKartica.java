package domaci_24_01;

public class SuperKartica {

	private int brojKartice;
	private String imeIprezime;
	private int popust;

	public SuperKartica(int brojKartice, String imeIprezime, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeIprezime = imeIprezime;
		this.popust = popust;
	}

	public SuperKartica() {

	}

	public int getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public void stampaj() {
		System.out.println(this.brojKartice + ", " + imeIprezime);
	}

}


//
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

