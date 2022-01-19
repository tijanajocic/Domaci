package domaci_17_01;

public class Racun {

	private String brojRacuna;
	private String imeIprezime;
	private double trenutnoStanje;
	


	public Racun(String brojRacuna, String imeIprezime, double trenutnoStanje) {
		
		this.brojRacuna = brojRacuna;
		this.imeIprezime = imeIprezime;
		this.trenutnoStanje = trenutnoStanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public void menjaStanje(double prosledjenaVrednost) {
		if (trenutnoStanje > prosledjenaVrednost) {
			trenutnoStanje = trenutnoStanje - prosledjenaVrednost;
		} else {
			System.out.println("Nemoguce je izvrsiti");
		}

	}

	public void stampaj() {
		System.out.println(imeIprezime + " " + brojRacuna);
		System.out.println("Stanje na racunu je " + trenutnoStanje);
	}

}
