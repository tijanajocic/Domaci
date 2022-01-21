package domaci_20_01;

public class zadatak1 {

	public static void main(String[] args) {

		Igrac igrac1 = new Igrac("Tijana Jocic", "5754675675", 1993, 5, "napadac", true);
		Trener trener1 = new Trener("Tijana Jocic trener", "5754675675", 1945, 56, "kondicionalni");

		igrac1.stampaj();
		trener1.stampaj();

	}

}
