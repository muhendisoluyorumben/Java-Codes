package Calismalar;

/**
 * Girilen String de�i�keni ters �eviren program.
 * @author Murat
 *	07.02.2021 / 20.47
 */
import java.util.Scanner;

public class Calisma010_StringTersCevirme {
	public static void main(String[] args) {
		String mesaj;
		char hadibak�m;
		System.out.println("yaz� giriniz");
		Scanner klavye= new Scanner(System.in);
		mesaj=klavye.nextLine();
		for(int i=mesaj.length()-1;i>=0;i--) {
		hadibak�m=mesaj.charAt(i);  // Stringi char' a �evirme.
		System.out.print(hadibak�m);
		}
		klavye.close();
	}

}
