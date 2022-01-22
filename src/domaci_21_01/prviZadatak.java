package domaci_21_01;

import java.util.ArrayList;

public class prviZadatak {

	public static void main(String[] args) {
		
		
		
		Sektor jedan = new Sektor ("admnistracija6", 666);
		Sektor dva = new Sektor ("admnistracija5", 566);
		Sektor tri = new Sektor ("admnistracija4", 77766);
		Sektor cetiri = new Sektor ("admnistracija3", 6);
		Sektor pet = new Sektor ("admnistracija2", 665426);
		Sektor sest = new Sektor ("admnistracija1", 4766);
		
		
		ArrayList <Sektor> sektori = new  ArrayList <Sektor>();
		
		sektori.add(jedan);
		sektori.add(dva);
		sektori.add(tri);
		sektori.add(cetiri);
		sektori.add(pet);
		sektori.add(sest);
		
		
		
		Menadzer menadzer1 = new Menadzer("Tijana Jocic", sektori);
		
		menadzer1.zaposli(jedan);
		menadzer1.zaposli(dva);
		menadzer1.zaposli(tri);
		menadzer1.zaposli(cetiri);
		menadzer1.zaposli(pet);
		menadzer1.zaposli(sest);
		
		
		Magacioner magacioner1 = new Magacioner ("Strahinja Mitic", sektori);
		
		magacioner1.zaposli(jedan);
		magacioner1.zaposli(dva);
		magacioner1.zaposli(tri);
		magacioner1.zaposli(cetiri);
		magacioner1.zaposli(pet);
		magacioner1.zaposli(sest);
		
		
		
		System.out.println(menadzer1.getImeIprezime() + " Plata: " + menadzer1.vracaPlatu() );
		System.out.println( magacioner1.getImeIprezime() + " Plata: " + magacioner1.vracaPlatu());
		
		

		

		
	}

}
