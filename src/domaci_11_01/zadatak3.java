package domaci_11_01;

public class zadatak3 {

	public static void main(String[] args) {

		FacebookPost t = new FacebookPost();

		t.imeIprezimeKorisnikaKojiJeObjavioPost = "Tijana Jocic";
		t.imeIprezimeKorisnikaNaKomJProfiluObjavljenPost = "Strahinja Mitic";
		t.brojLajkova = 2;
		t.brojDeljenja = 3;
		t.tekstObjave = "Tjana je car";

		t.print();
		t.dislike();
		t.dislike();
		t.dislike();
		t.dislike();
		t.share();
		t.share();
		t.like();
		t.like();
		t.like();
		t.print();

	}

}
