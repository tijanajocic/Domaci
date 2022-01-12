package domaci_11_01;

public class Proizvod {
	
	String nazivProizvoda;
	double cenaProizvoda;
	double tezinaProizvoda;
	
	public void stampaj () {
		System.out.println(nazivProizvoda + ", " + cenaProizvoda + ", " + tezinaProizvoda);	
	}

	public void povecajCenu (int povecanje) {
		cenaProizvoda=cenaProizvoda+povecanje;
	}
	
	public double vratiCenuSaPopustom (int popust) {
		double cenaSaPopustom= cenaProizvoda - (cenaProizvoda / popust);
		return cenaSaPopustom;
	}
	
	public int racunajPostarinu () {
		if (tezinaProizvoda<=100) {
			return 200;
		}
		else if (100<tezinaProizvoda && tezinaProizvoda <500) {
			return 400;
		}
		else {
			return 1000;
		}
	}
	

}
