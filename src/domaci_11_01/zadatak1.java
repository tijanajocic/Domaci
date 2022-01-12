package domaci_11_01;

public class zadatak1 {

	public static void main(String[] args) {

		Proizvod t = new Proizvod();

		t.cenaProizvoda = 60;
		t.tezinaProizvoda = 132;
		t.nazivProizvoda = "Rum kasato";

		Proizvod s = new Proizvod();
		s.cenaProizvoda = 50;
		s.tezinaProizvoda = 560;
		s.nazivProizvoda = "Plazma";

		t.stampaj();
		s.stampaj();
		t.povecajCenu(10);
		s.povecajCenu(15);
		t.vratiCenuSaPopustom(10);
		s.vratiCenuSaPopustom(23);
		t.racunajPostarinu();
		s.racunajPostarinu();

	}

}
