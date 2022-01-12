package domaci_10_01;

public class zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning t= new SmartAirConditioning();
		
		t.markaKlime="Samsung";
		t.temperatura="23";
		t.mod="hladjenje";
		t.stampaj();
		
		SmartAirConditioning s= new SmartAirConditioning();
		
		s.markaKlime="LG";
		s.temperatura="33";
		s.mod="grejanje";
		s.stampaj();
	}

}
