package Calismalar;
/**
 * Bir say�y� olu�turan rakamlar�n fakt�riyellerinin toplam� kendisine 
 * e�it olan say�lara faktoryon sayi denir. �ne�in 145=1!+4!+5! gibi. Klavyeden 
 * girilen bir say�n�n faktoryon sayi olup olmad���n� bulup ekrana yazan program.
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
		korumalisayi=sayi; // sayi de�i�keni �zerinde i�lem yapaca��m�zdan dolay� say�y� �zerinde i�lem yapmayaca��m�z bir de�i�kene at�yoruz
		
		do {
			rakam=sayi%10; // say�y�n�n 10 a g�re modunu al�yor ve kalan� rakam de�i�kenine at�ryoruz ve bu sayede birler basama��n� elde etmi� oluyoruz
			sayi=sayi/10;  //burdaki i�lem ile de say�n�n basamak de�erini bir azalt�yoruz. yan� say� 145 ise 14 e �eviriyyor ve her deferinde �stteki i�lem ile de birler basama��n� elde ediyoruz
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
