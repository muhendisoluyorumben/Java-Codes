/**
 * Bir sayıyı oluşturan rakamların faktöriyellerinin toplamı kendisine 
 * eşit olan sayılara faktoryon sayi denir. Öneğin 145=1!+4!+5! gibi. Klavyeden 
 * girilen bir sayının faktoryon sayi olup olmadığını bulup ekrana yazan program.
 * @author Murat
 * 12.02.2021 / 16.34
 */
import java.util.Scanner;

public class Calisma017_FaktoryonSayi {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		int faktor,sayi,rakam,toplam=0,korumalisayi;
		System.out.println("Sayiyi giriniz");
		sayi=klavye.nextInt();
		korumalisayi=sayi; // sayi değişkeni üzerinde işlem yapacağımızdan dolayı sayıyı üzerinde işlem yapmayacağımız bir değişkene atıyoruz
		
		do {
			rakam=sayi%10; // sayıyının 10 a göre modunu alıyor ve kalanı rakam değişkenine atıryoruz ve bu sayede birler basamağını elde etmiş oluyoruz
			sayi=sayi/10;  //burdaki işlem ile de sayının basamak değerini bir azaltıyoruz. yanı sayı 145 ise 14 e çeviriyyor ve her deferinde üstteki işlem ile de birler basamağını elde ediyoruz
			faktor=1;
			for(int i=rakam;i>1;i--) {
				faktor*=i;
			}
			toplam+=faktor;
			if(sayi<=0) {
				break;
			}
		}while(true);
		if(toplam==korumalisayi) {
			System.out.println("Sayi faktoryondur");
		}
		else
			System.out.println("Sayi faktoryon degildir");
		
		klavye.close();
	}

}
