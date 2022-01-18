package domaci_17_01;

import java.util.ArrayList;

public class zadatak1 {

	public static void main(String[] args) {

		
		ArrayList<ZeleniKarton> lista = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton prvi = new ZeleniKarton("Tijana Jocic", 3333, "klimatologija", "Mila Pavlovic", 6);
		ZeleniKarton drugi = new ZeleniKarton("Tijana Mitic", 3353, "hidrologija", "Ana Anic", 7);
		ZeleniKarton treci = new ZeleniKarton("Strahinja Mitic", 3883, "geomorgologija", "Pera Peric", 9);
		ZeleniKarton cetvrti = new ZeleniKarton("Jana Jocic", 3377, "pedologija", "Suncica Jovic", 6);
		ZeleniKarton peti = new ZeleniKarton("Radomir Mitic", 3344, "bilogija", "Mila Pavlovic", 10);
		ZeleniKarton sesti = new ZeleniKarton("Lana Markovic", 3833, "matematika", "Mila Pavlovic", 7);
		ZeleniKarton sedmi = new ZeleniKarton("Neda Jocic", 3993, "istorija", "Mila Pavlovic", 8);
		ZeleniKarton osmi = new ZeleniKarton("Nada Jovanovic", 3453, "muzicko", "Mila Pavlovic", 8);
		ZeleniKarton deveti = new ZeleniKarton("Ena Enic", 3033, "likovno", "Mila Pavlovic", 7);
		ZeleniKarton deseti = new ZeleniKarton("Ankica Pesic", 3453, "fizicko", "Mila Pavlovic", 9);


prvi.stampaj();
drugi.stampaj();
treci.stampaj();
cetvrti.stampaj();
peti.stampaj();
sesti.stampaj();
sedmi.stampaj();
osmi.stampaj();
deveti.stampaj();
deseti.stampaj();

		
	}

}
