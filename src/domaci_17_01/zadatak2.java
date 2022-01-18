package domaci_17_01;

public class zadatak2 {

	public static void main(String[] args) {

		Transakcija m = new Transakcija(453, 5555555, 77777777);
		Racun s = new Racun ();
		
		
		s.setBrojRacuna("44445-443");
		s.setImeIprezime("Tijana Jocic");
		s.getTrenutnoStanje();
		
		s.stampaj();
		
		
	}

}
