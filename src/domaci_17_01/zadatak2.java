package domaci_17_01;

public class zadatak2 {

	public static void main(String[] args) {
		
		
		Racun s = new Racun ("55554", "Tijana Jocic", 500);
		Racun t = new Racun ("5454554", "Strahinja mitic", 500);
		Transakcija m = new Transakcija(566565, s, t);
		
		
		
		m.izvrsiTransakciju(20);
		s.stampaj();
		t.stampaj();		
		
		
	}

}
