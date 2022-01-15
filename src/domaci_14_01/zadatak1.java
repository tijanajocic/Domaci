package domaci_14_01;

public class zadatak1 {

	public static void main(String[] args) {

		Autor prvi = new Autor("Nenad", "Stojanovic");
		Knjiga prva = new Knjiga(322, "Naziv", "1993", prvi);

		prva.stampaj();

		Autor drugi = new Autor("Tijana", "Marinkovic");
		Knjiga druga = new Knjiga(662, "Naziv1", "1999", drugi);

		druga.stampaj();

	}

}
