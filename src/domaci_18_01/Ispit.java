package domaci_18_01;

public class Ispit {

	private String nazivPredmeta;
	private int ocena;
	private String imeIprezimeProfesora;

	public Ispit(String nazivPredmeta, int ocena, String imeIprezimeProfesora) {
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.imeIprezimeProfesora = imeIprezimeProfesora;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImeIprezimeProfesora() {
		return imeIprezimeProfesora;
	}

	public void setImeIprezimeProfesora(String imeIprezimeProfesora) {
		this.imeIprezimeProfesora = imeIprezimeProfesora;
	}

	public boolean jePolozen() {
		if (ocena > 5) {
			return true;

		} else {
			return false;
		}

	}
	
	public void stampaj () {
		System.out.println(this.nazivPredmeta + "-" + imeIprezimeProfesora + "-" + ocena);
	}
	
}
