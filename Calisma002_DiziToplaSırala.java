package Calismalar;


/*
 * N (N<=100 olmak �zere) elemanl� iki diziye rand() yard�m�yla [1, 100) aras�nda rastgele
 *  tamsay�lar girilmektedir.bu iki dizinin elemanlar� toplayan ve dizileri k���kten b�y��e do�ru  
 *  s�ralayan ve diziye atanan say�lar� s�ralamadan �NCE ve 
 *  s�ralamadan SONRA  yan yana 
 *  ekrana yazan program.
 *  04.02.2021 / 17.30
 *  MRT
 */
import java.util.Random;
import java.util.Scanner;

public class Calisma002_DiziToplaS�rala {
	public static void main(String[] args) {
		int[] dizi1, dizi2, diziTop;
		int boyut;

		Scanner klavye = new Scanner(System.in);

		System.out.println("Dizilerin boyutunu giriniz");
		do {
			boyut = klavye.nextInt();
			if (boyut > 0) {
				break;
			} else {
				System.err.println("Pozitif say� giriniz!");
			}
		} while (true);

		dizi1 = new int[boyut];
		dizi2 = new int[boyut];
		diziTop = new int[boyut];

		dizi1 = diziOlustur(dizi1, boyut);
		dizi2 = diziOlustur(dizi2, boyut);

		for (int i = 0; i < boyut; i++) {
			diziTop[i] = dizi1[i] + dizi2[i];
		}
		System.out.println("Dizilerin ilk halleri.");
		System.out.print("1. Dizi: ");
		yazdir(dizi1);
		System.out.print("2. Dizi: ");
		yazdir(dizi2);
		System.out.print("Toplam : ");
		yazdir(diziTop);

		System.out.println("");
		System.out.println("Dizilerin b�y�kten k����e do�ru s�ralanm�� halleri.");
		System.out.print("1. Dizi: ");
		siralaYazdir(dizi1, boyut);
		System.out.print("2. Dizi: ");
		siralaYazdir(dizi2, boyut);
		System.out.print("Toplam : ");
		siralaYazdir(diziTop, boyut);
	}

	public static int[] diziOlustur(int[] dizi, int boyu) {
		Random rand = new Random();
		for (int i = 0; i < boyu; i++) {
			dizi[i] = rand.nextInt((100 - 1) + 1) + 1;
		}
		return dizi;
	}

	private static void yazdir(int[] dizi) {
		for (int veri : dizi) {
			System.out.printf("%4d", veri);
		}
		System.out.println("");
	}

	private static void siralaYazdir(int[] dizi, int boyu) {
		int temp = 0;
		for (int j = 0; j < boyu; j++) {
			for (int i = 0; i < boyu - 1; i++) {
				if (dizi[i] > dizi[i + 1]) {
					temp = dizi[i];
					dizi[i] = dizi[i + 1];
					dizi[i + 1] = temp;
				}
			}
		}

		yazdir(dizi);

	}

}
