package Calismalar;
/*
 * Bir sayýnýn kendisi hariç pozitif tamsayý çarpanlarý( kalansýz bölen sayýlarýn)
 * toplamý kendisine eþitse o sayýya mükemmel sayý denir. Klavyeden girilen sayýnýn
 * mükemmel sayý olup omadýðý ekrana yazan program.
 * 
 * 06.02.2021 / 11.41
 * MRT
 */
import java.util.Scanner;
public class Calisma004_MukemmelSayi {
	public static void main(String[] args) {
		Scanner klavye= new Scanner(System.in);
		int sayi,bolenToplam=0;
		System.out.println("Sayýyý giriniz : ");
		sayi=klavye.nextInt();
		for(int i=1;i<sayi;i++) {
			if(0==sayi%i) {
				bolenToplam=bolenToplam+i;
			}
		}
		if(bolenToplam==sayi) {
			System.out.println(sayi+" sayýsý mükemmel sayýdýr");
		}else {
			System.out.println(sayi+" sayýsý mükemmel sayý deðildir");
		}
		klavye.close();
	}
}
