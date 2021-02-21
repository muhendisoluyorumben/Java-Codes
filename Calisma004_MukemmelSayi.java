
/*
 * Bir sayının kendisi hariç pozitif tamsayı çarpanları( kalansız bölen sayıların)
 * toplamı kendisine eşitse o sayıya mükemmel sayı denir. Klavyeden girilen sayının
 * mükemmel sayı olup omadığı ekrana yazan program.
 * 
 * 06.02.2021 / 11.41
 * MRT
 */
import java.util.Scanner;
public class Calisma004_MukemmelSayi {
	public static void main(String[] args) {
		Scanner klavye= new Scanner(System.in);
		int sayi,bolenToplam=0;
		System.out.println("Sayıyı giriniz : ");
		sayi=klavye.nextInt();
		for(int i=1;i<sayi;i++) {
			if(0==sayi%i) {
				bolenToplam=bolenToplam+i;
			}
		}
		if(bolenToplam==sayi) {
			System.out.println(sayi+" sayısı mükemmel sayıdır");
		}else {
			System.out.println(sayi+" sayısı mükemmel sayı değildir");
		}
		klavye.close();
	}
}
