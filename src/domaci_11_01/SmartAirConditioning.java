package domaci_11_01;

public class SmartAirConditioning {

	String markaKlime;
	int potrosnjaDokHladi;
	int potrosnjaDokGreje;
	int temperatura;
	String mod;

	public void stampaj() {
		System.out.println(this.markaKlime + this.mod + this.temperatura);
	}

	public int mesecnaPotrosnja() {
		if (mod.equals("hladi")) {
			return 30 * 15 * potrosnjaDokHladi;
		} else {
			return 30 * 15 * potrosnjaDokGreje;
		}
	}

	public int kolikoNovcaPotrosi() {
		int cena = 0;
		if (this.mesecnaPotrosnja() > 350) {
			cena = 350 * 6;
			int ostatak = this.mesecnaPotrosnja() - 350;
			cena = cena + (ostatak * 9);
		}
		return cena;
	}

}
