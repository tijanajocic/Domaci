package domaci_17_01;

public class ZeleniKarton {

	private String imeIprezimeStudenta;
	private int brojIndexa;
	private String nazivPredmeta;
	private String imeIprezimeProfesora;
	private int ocena;

	public ZeleniKarton(String imeIprezimeStudenta, int brojIndexa, String nazivPredmeta, String imeIprezimeProfesora,
			int ocena) {
		this.imeIprezimeStudenta = imeIprezimeStudenta;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIprezimeProfesora = imeIprezimeProfesora;
		this.ocena = ocena;
	}

	public String getimeIprezimeStudenta() {
		return this.imeIprezimeStudenta;
	}

	public int getbrojIndexa() {
		return this.brojIndexa;
	}

	public String getnazivPredmeta() {
		return this.nazivPredmeta;
	}

	public String getimeIprezimeProfesora() {
		return this.imeIprezimeProfesora;
	}

	public int getocena() {
		return this.ocena;
	}

	public void setimeIprezimeStudenta(String imeIprezimeStudenta) {
		this.imeIprezimeStudenta = imeIprezimeStudenta;
	}

	public void setnazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public void setbrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public void setimeIprezimeProfesora(String imeIprezimeProfesora) {
		this.imeIprezimeProfesora = imeIprezimeProfesora;
	}

	public void setocena(int ocena) {
		this.ocena = ocena;
	}
	public boolean daLiJePolozen () {
		if (ocena > 5) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public void stampaj () {
		System.out.println(nazivPredmeta + "-" + ocena);
		System.out.println("Student: " + imeIprezimeStudenta + " " + brojIndexa);
		System.out.println("Profesor: " + imeIprezimeProfesora);
	}
	
	
	
}
