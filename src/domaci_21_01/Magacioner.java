package domaci_21_01;

import java.util.ArrayList;

public class Magacioner extends Radnik {

	public Magacioner(String imeIprezime, ArrayList<Sektor> sektori) {
		super(imeIprezime, sektori);
	}

	private double prosecnaPlata() {
		double prosecnaPlata = 0;
		int x = 0;
		double y = 0;
		for (int i = 0; i < sektori.size(); i++) {
			if (getSektori().equals(sektori)) {
				x++;
				y = prosecnaPlata + sektori.get(i).getPlata();
			}}
			return y / x * 0.5;
		}

	

	@Override
	public double vracaPlatu() {
		int x = 0; 
		for (int i = 0; i < sektori.size(); i++) {
			if (getSektori().equals(sektori)) {
				x++;
				
			}
		}
			return prosecnaPlata() * x;
		}
	}


