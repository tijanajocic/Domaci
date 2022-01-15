package domaci_13_01;

public class FacebookPost {

	private String imeIprezimeKorisnikaKojiJeObjavioPost;
	private String imeIprezimeKorisnikaNaKomJProfiluObjavljenPost;
	private String tekstObjave;
	private int brojLajkova;
	private int brojDeljenja;

	public FacebookPost(String imeIprezimeKorisnikaKojiJeObjavioPost,
			String imeIprezimeKorisnikaNaKomJProfiluObjavljenPost, String tekstObjave, int brojLajkova,
			int brojDeljenja) {
		this.brojLajkova = brojLajkova;
		this.brojDeljenja = brojDeljenja;
		this.tekstObjave = tekstObjave;
		this.imeIprezimeKorisnikaKojiJeObjavioPost = imeIprezimeKorisnikaKojiJeObjavioPost;
		this.imeIprezimeKorisnikaNaKomJProfiluObjavljenPost = imeIprezimeKorisnikaNaKomJProfiluObjavljenPost;
	}

	public String getimeIprezimeKorisnikaKojiJeObjavioPost() {
		return this.imeIprezimeKorisnikaKojiJeObjavioPost;
	}

	public String getimeIprezimeKorisnikaNaKomJProfiluObjavljenPost() {
		return this.imeIprezimeKorisnikaNaKomJProfiluObjavljenPost;
	}

	public String gettekstObjave() {
		return this.tekstObjave;

	}

	public int getbrojLajkova() {
		return this.brojLajkova;
	}

	public int getBrojDeljenja() {
		return this.brojDeljenja;
	}

	public void setimeIprezimeKorisnikaKojiJeObjavioPost(String imeIprezimeKorisnikaKojiJeObjavioPost) {
		this.imeIprezimeKorisnikaKojiJeObjavioPost = imeIprezimeKorisnikaKojiJeObjavioPost;
	}

	public void setimeIprezimeKorisnikaNaKomJProfiluObjavljenPost(
			String imeIprezimeKorisnikaNaKomJProfiluObjavljenPost) {
		this.imeIprezimeKorisnikaNaKomJProfiluObjavljenPost = imeIprezimeKorisnikaNaKomJProfiluObjavljenPost;
	}

	public void settekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}

	public void like() {
		brojLajkova = brojLajkova + 1;
	}

	public void dislike() {
		brojLajkova = brojLajkova - 1;
		if (brojLajkova < 0) {
			brojLajkova = 0;
		}
	}

	public void share() {
		brojDeljenja = brojDeljenja + 1;
	}

	public void print() {
		System.out.println(
				imeIprezimeKorisnikaKojiJeObjavioPost + " >>> " + imeIprezimeKorisnikaNaKomJProfiluObjavljenPost);
		System.out.println(tekstObjave);
		System.out.println("Likes " + brojLajkova + "  |  " + "Shares " + brojDeljenja);
	}

}

//1.Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post
//	(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	  Od gettera i settera:
//	korisnik moze da procita bilo koji atribut 
//	ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove
//			atribute)
//	 Konstruktore:
//		konstruktori koji su potrebni i logicni
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude 
//			manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati
//	svaku funkciju.
