package Calismalar;
/*
 * Bir say�n�n kendisi hari� pozitif tamsay� �arpanlar�( kalans�z b�len say�lar�n)
 * toplam� kendisine e�itse o say�ya m�kemmel say� denir. Klavyeden girilen say�n�n
 * m�kemmel say� olup omad��� ekrana yazan program.
 * 
 * 06.02.2021 / 11.41
 * MRT
 */
import java.util.Scanner;
public class Calisma004_MukemmelSayi {
	public static void main(String[] args) {
		Scanner klavye= new Scanner(System.in);
		int sayi,bolenToplam=0;
		System.out.println("Say�y� giriniz : ");
		sayi=klavye.nextInt();
		for(int i=1;i<sayi;i++) {
			if(0==sayi%i) {
				bolenToplam=bolenToplam+i;
			}
		}
		if(bolenToplam==sayi) {
			System.out.println(sayi+" say�s� m�kemmel say�d�r");
		}else {
			System.out.println(sayi+" say�s� m�kemmel say� de�ildir");
		}
		klavye.close();
	}
}
