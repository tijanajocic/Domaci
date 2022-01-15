package domaci_14_01;

public class Knjiga {

	private int isbn;
	private String naziv;
	private String godinaIzdanja;
	private Autor autor;

	public Knjiga(int isbn, String naziv, String godinaIzdanja, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public int getisbn() {
		return this.isbn;
	}

	public String getnaziv() {
		return this.naziv;
	}

	public String getgodinaIzdanja() {
		return this.godinaIzdanja;
	}

	public Autor getautor() {
		return this.autor;
	}

	public void setisbn(int isbn) {
		this.isbn = isbn;
	}

	public void setnaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setgodinaIzdanja(String godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public void setautor(Autor autor) {
		this.autor = autor;
	}

	public void stampaj() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		System.out.println(this.autor.getime() + " " + this.autor.getprezime());
	}

}

//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora) 
