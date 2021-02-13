package Calismalar;

/*
 *Pozitif tam sayýyý kalansýz bölenler sayýsý bu sayýyý kalansýz bölüyorsa bu sayýya Tau sayýsý denir.
 *8 sayýsýný 1, 2, 3, 4 sayýlarý kalansýz böler. Kalansýz bölen sayýsý 4'tür ve 4' de 8'i kalansýz böler.
 *8 sayýsý Tau sayýsýdýr. Buna göre klavyeden girilen bir sayýnýn Tau sayý olup olmadýðýný bulan 
 *ve ekrana yazan bir program yazýnýz. 
 * 
 * 07.02.2021 / 12.54
 * MRT
 */
import java.util.Scanner;
public class Calisma008_TauSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye=new Scanner(System.in);
		int sayi,bolenSayisi=0;
		System.out.println("Sayýyý giriniz:");
		sayi=klavye.nextInt();
		for(int i=1;i<=sayi;i++) {
			if(0==sayi%i) {
				bolenSayisi++;
			}
		}
		if(0==sayi%bolenSayisi) {
			System.out.println("Sayý Tau sayýsýdýr.");
		}
		else {
			System.out.println("Sayý Tau sayýsý deðildir.");
		}
		klavye.close();
	}

}
