package provaverificatepsit;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Libro l1 = new Libro("titolo1","descrizione1","codice1","autore1");
		Libro l2 = new Libro("titolo2","descrizione2","codice2","autore2");
		Libro l3 = new Libro("titolo3","descrizione3","codice3","autore3");
		Libro l4 = new Libro("titolo4","descrizione4","codice4","autore4");
		
		Libri libri = new Libri();
		
		//aggiunta libri
		libri.addLibro(l1);
		libri.addLibro(l2);
		libri.addLibro(l3);
		libri.addLibro(l4);
		
		//cerca e mostra lib
		Libro librotrovato = new Libro();
		System.out.println(librotrovato.toString());

	}
	
}
