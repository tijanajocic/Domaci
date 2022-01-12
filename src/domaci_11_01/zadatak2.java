package domaci_11_01;

public class zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning t = new SmartAirConditioning();

		t.potrosnjaDokGreje = 2;
		t.potrosnjaDokHladi = 1;
		t.mod = "hladi";

		t.stampaj();
		t.kolikoNovcaPotrosi();
		t.mesecnaPotrosnja();

	}

}
