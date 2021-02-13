package Calismalar;

/* 2^n + 1 bi�iminde yaz�labilen do�al say�lara Cullen say� denir.
* Klavyeden girilen bir say�n�n Cullen say� olup olmad���n� ekrana yazan program
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
		System.out.println("Say�y� giriniz");
		sayi=klavye.nextInt();
		klavye.close();
		int sayac=0;
		while(sayac<sayi) {
			if(sayi==Math.pow(2,sayac)*sayac+1) {
				System.out.println(sayi+" say�s� Cullen say�d�r");
				break;
			}else
			sayac++;
		}
		if(sayac==sayi) {
			System.out.println(sayi+" say�s� Cullen say� de�ildir");
		}
	}

}
