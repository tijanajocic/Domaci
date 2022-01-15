package domaci_14_01;

public class Autor {

	private String ime;
	private String prezime;
	
	public Autor (String ime, String prezime) {
		this.ime=ime;
		this.prezime=prezime;
	}

	public String getime() {
		return this.ime;
	}

	public String getprezime() {
		return this.prezime;
	}

	public void setime(String ime) {
		this.ime = ime;
	}
	public void setprezime(String prezime) {
		this.prezime=prezime;
	}

	
	public void stampaj () {
		System.out.println(this.ime + this.prezime);
	}
}

//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
