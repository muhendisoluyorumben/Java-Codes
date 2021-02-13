package Calismalar;
/**
 * Bir sayýyý oluþturan rakamlarýn faktöriyellerinin toplamý kendisine 
 * eþit olan sayýlara faktoryon sayi denir. Öneðin 145=1!+4!+5! gibi. Klavyeden 
 * girilen bir sayýnýn faktoryon sayi olup olmadýðýný bulup ekrana yazan program.
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
		korumalisayi=sayi; // sayi deðiþkeni üzerinde iþlem yapacaðýmýzdan dolayý sayýyý üzerinde iþlem yapmayacaðýmýz bir deðiþkene atýyoruz
		
		do {
			rakam=sayi%10; // sayýyýnýn 10 a göre modunu alýyor ve kalaný rakam deðiþkenine atýryoruz ve bu sayede birler basamaðýný elde etmiþ oluyoruz
			sayi=sayi/10;  //burdaki iþlem ile de sayýnýn basamak deðerini bir azaltýyoruz. yaný sayý 145 ise 14 e çeviriyyor ve her deferinde üstteki iþlem ile de birler basamaðýný elde ediyoruz
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
