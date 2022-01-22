package domaci_21_01;

import java.util.ArrayList;

public abstract class Radnik {
	protected String imeIprezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	
	
	
	public Radnik(String imeIprezime, ArrayList<Sektor> nizSektora) {
		super();
		this.imeIprezime = imeIprezime;
		this.sektori=sektori;
		
	}

	
	
	
	
	
	public String getImeIprezime() {
		return imeIprezime;
	}






	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}






	public ArrayList<Sektor> getSektori() {
		return sektori;
	}






	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}






	public abstract double vracaPlatu();

	public void zaposli(Sektor sektori) {
		this.sektori.add(sektori);

	}

}
