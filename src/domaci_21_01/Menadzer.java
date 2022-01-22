package domaci_21_01;

import java.util.ArrayList;

public class Menadzer extends Radnik {

	public Menadzer(String imeIprezime, ArrayList<Sektor> sektori) {
		super(imeIprezime, sektori);
	}

	@Override
	public double vracaPlatu() {
		int suma = 0;
		for (int i = 0; i < sektori.size(); i++) {
			suma = suma + sektori.get(i).getPlata();

		}
		return suma;

	}
}
