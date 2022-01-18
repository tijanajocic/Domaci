package domaci_17_01;

public class Racun {

	private String brojRacuna;
	private String imeIprezime;
	private int trenutnoStanje;
	


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

	public int getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public void menjaStanje(int prosledjenaVrednost) {
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
