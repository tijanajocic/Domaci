package domaci_18_01;

public class zadatak1 {

	public static void main(String[] args) {

		Student student1 = new Student (333, "Tijana Jocic", "geogrfija");
		
		Ispit ispit1 = new Ispit ("Klimatologija", 5, "Aca Rajcic");
		Ispit ispit2 = new Ispit ("Hidrologija", 10, "Aca Rajcic");
		Ispit ispit3 = new Ispit ("Istorijaa", 5, "Aca Rajcic");
		Ispit ispit4 = new Ispit ("Biologija", 9, "Aca Rajcic");
		Ispit ispit5 = new Ispit ("Fizicko", 8, "Aca Rajcic");
		Ispit ispit6 = new Ispit ("Muzicko", 7 , "Aca Rajcic");
		Ispit ispit7 = new Ispit ("Likovno", 6, "Aca Rajcic");

	student1.dodajIspit(ispit1);
	student1.dodajIspit(ispit2);
	student1.dodajIspit(ispit3);
	student1.dodajIspit(ispit4);
	student1.dodajIspit(ispit5);
	student1.dodajIspit(ispit6);
	student1.stampaj();
		
		
		
	}

}
