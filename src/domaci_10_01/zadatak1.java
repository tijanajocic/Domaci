package domaci_10_01;

public class zadatak1 {

	public static void main(String[] args) {

		Proizvod t = new Proizvod();

		t.nazivProizvoda = "Cokolada";
		t.cenaProizvoda = 35;
		t.tezinaProizvoda = 100.5;

		t.stampaj();
		
		
		Proizvod s =  new Proizvod ();
		
		s.nazivProizvoda="Plazma";
		s.cenaProizvoda=45;
		s.tezinaProizvoda=200;
		
		s.stampaj();
	}

}
