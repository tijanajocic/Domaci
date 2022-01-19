package domaci_18_01;

import java.util.ArrayList;

import javax.swing.JEditorPane;

public class Student {

	private int brojIndexa;
	private String imeIprezime;
	private String tipStudije;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(int brojIndexa, String imeIprezime, String tipStudije) {
		this.brojIndexa = brojIndexa;
		this.imeIprezime = imeIprezime;
		this.tipStudije = tipStudije;

	}

	
	
	public void setIspiti(ArrayList<Ispit> ispiti) {
		this.ispiti = ispiti;
	}



	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public String getTipStudije() {
		return tipStudije;
	}

	public void setTipStudije(String tipStudije) {
		this.tipStudije = tipStudije;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {

		this.ispiti.add(ispit);
	}

	public double prosek() {
		double suma = 0;
		double brojPolozenihIspita = 0;
		double prosecnaOcena=0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (this.ispiti.get(i).jePolozen() == true) {
				suma = suma + ispiti.get(i).getOcena();
				brojPolozenihIspita++;
			}
		}
		return prosecnaOcena= suma / brojPolozenihIspita;

	}

	public void stampaj() {

		System.out.println(this.brojIndexa + " " + this.imeIprezime + " " + this.tipStudije);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
		System.out.println(ispiti.get(i).getNazivPredmeta() + " " + ispiti.get(i).getImeIprezimeProfesora() + " " + ispiti.get(i).getOcena());
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}

}

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
