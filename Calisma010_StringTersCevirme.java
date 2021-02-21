
/**
 * Girilen String deðiþkeni ters çeviren program.
 * @author Murat
 * 07.02.2021 / 20.47
 */
import java.util.Scanner;

public class Calisma010_StringTersCevirme {
	public static void main(String[] args) {
		String mesaj;
		char hadibakým;
		System.out.println("yazý giriniz");
		Scanner klavye= new Scanner(System.in);
		mesaj=klavye.nextLine();
		for(int i=mesaj.length()-1;i>=0;i--) {
		hadibakým=mesaj.charAt(i);  // Stringi char' a çevirme.
		System.out.print(hadibakým);
		}
		klavye.close();
	}

}
