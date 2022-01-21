package domaci_20_01;

public class Trener extends Osoba {
	private int godineIskustva;
	private String tipTrenera;

	
	
	
	



	public Trener(String imeIprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera ) {
		super(imeIprezime, jmbg, godinaRodjenja);
		this.godineIskustva=godineIskustva;
		this.tipTrenera=tipTrenera;
	}




	public void stampaj () {
		System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", " + this.godineIskustva + ", " + this.tipTrenera );
	}
}
