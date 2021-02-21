

/* 2^n + 1 biçiminde yazılabilen doğal sayılara Cullen sayı denir.
* Klavyeden girilen bir sayının Cullen sayı olup olmadığını ekrana yazan program
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
		System.out.println("Sayıyı giriniz");
		sayi=klavye.nextInt();
		klavye.close();
		int sayac=0;
		while(sayac<sayi) {
			if(sayi==Math.pow(2,sayac)*sayac+1) {
				System.out.println(sayi+" sayısı Cullen sayıdır");
				break;
			}else
			sayac++;
		}
		if(sayac==sayi) {
			System.out.println(sayi+" sayısı Cullen sayı değildir");
		}
	}

}
