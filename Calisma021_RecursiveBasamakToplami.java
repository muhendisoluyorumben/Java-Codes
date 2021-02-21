/**
 * Recursive fonksiyonla girilen sayinin basamak degerlerinin toplamini bulan program.
 * @author Murat
 * 12.02.2021 / 11.34
 */
import java.util.*;

public class Calisma021_RecursiveBasamakToplami {
	public static void main(String[] args) {
		int sayi;
		Scanner klavye=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		sayi=klavye.nextInt();
		System.out.println("Basamak Degerleri Toplami "+fonksiyon(sayi));
		klavye.close();
	}
	public static int fonksiyon(int say) {
		int basToplam=0;
		if(say>1) {
			basToplam=say%10+fonksiyon(say/10);
			return basToplam;
		}else
			return 0;
	}
}
