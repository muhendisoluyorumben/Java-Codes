package Calismalar;

/*
 *Pozitif tam say�y� kalans�z b�lenler say�s� bu say�y� kalans�z b�l�yorsa bu say�ya Tau say�s� denir.
 *8 say�s�n� 1, 2, 3, 4 say�lar� kalans�z b�ler. Kalans�z b�len say�s� 4't�r ve 4' de 8'i kalans�z b�ler.
 *8 say�s� Tau say�s�d�r. Buna g�re klavyeden girilen bir say�n�n Tau say� olup olmad���n� bulan 
 *ve ekrana yazan bir program yaz�n�z. 
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
		System.out.println("Say�y� giriniz:");
		sayi=klavye.nextInt();
		for(int i=1;i<=sayi;i++) {
			if(0==sayi%i) {
				bolenSayisi++;
			}
		}
		if(0==sayi%bolenSayisi) {
			System.out.println("Say� Tau say�s�d�r.");
		}
		else {
			System.out.println("Say� Tau say�s� de�ildir.");
		}
		klavye.close();
	}

}
