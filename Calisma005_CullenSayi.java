package Calismalar;

/* 2^n + 1 biçiminde yazýlabilen doðal sayýlara Cullen sayý denir.
* Klavyeden girilen bir sayýnýn Cullen sayý olup olmadýðýný ekrana yazan program
* 
* 06.02.2021 / 11.56
* MRT
*/
import java.util.Scanner;
public class Calisma005_CullenSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi;
		Scanner klavye= new Scanner(System.in);
		System.out.println("Sayýyý giriniz");
		sayi=klavye.nextInt();
		klavye.close();
		int sayac=0;
		while(sayac<sayi) {
			if(sayi==Math.pow(2,sayac)*sayac+1) {
				System.out.println(sayi+" sayýsý Cullen sayýdýr");
				break;
			}else
			sayac++;
		}
		if(sayac==sayi) {
			System.out.println(sayi+" sayýsý Cullen sayý deðildir");
		}
	}

}
