package domaci_11_01;

public class FacebookPost {

	String imeIprezimeKorisnikaKojiJeObjavioPost;
	String imeIprezimeKorisnikaNaKomJProfiluObjavljenPost;
	String tekstObjave;
	int brojLajkova;
	int brojDeljenja;

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
