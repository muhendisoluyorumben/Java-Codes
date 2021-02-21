
/*
 *Pozitif tam sayıyı kalansız bölenler sayısı bu sayıyı kalansız bölüyorsa bu sayıya Tau sayısı denir.
 *8 sayısını 1, 2, 3, 4 sayıları kalansız böler. Kalansız bölen sayısı 4'tür ve 4' de 8'i kalansız böler.
 *8 sayısı Tau sayısıdır. Buna göre klavyeden girilen bir sayının Tau sayı olup olmadığını bulan 
 *ve ekrana yazan bir program yazınız. 
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
		System.out.println("Sayıyı giriniz:");
		sayi=klavye.nextInt();
		for(int i=1;i<=sayi;i++) {
			if(0==sayi%i) {
				bolenSayisi++;
			}
		}
		if(0==sayi%bolenSayisi) {
			System.out.println("Sayı Tau sayısıdır.");
		}
		else {
			System.out.println("Sayı Tau sayısı değildir.");
		}
		klavye.close();
	}

}
