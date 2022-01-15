package domaci_13_01;

public class zadatak1 {

	public static void main(String[] args) {

		FacebookPost t = new FacebookPost("Tijana", "Strahinja", "tijana je car", 4, 2);

		t.dislike();
		t.like();
		t.share();
		t.print();

		FacebookPost k = new FacebookPost("Neda", "Lana", "tijana je car", 4, 5);

		k.like();
		k.share();
		k.dislike();
		k.dislike();
		k.print();
	}

}
