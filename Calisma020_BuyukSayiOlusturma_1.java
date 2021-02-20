package Calismalar;

/**
 * G�reviniz, herhangi bir negatif olmayan tamsay�y� ba��ms�z de�i�ken olarak al�p rakamlar� azalan
 * s�rada d�nd�rebilen bir i�lev yapmakt�r. Esasen, m�mk�n olan en y�ksek say�y� olu�turmak i�in rakamlar� yeniden d�zenleyin.
 *
 * @author Murat
 *
 * 19.02.2021 / 00.00
 */
import java.util.Scanner;

public class Calisma020_BuyukSayiOlusturma_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 0, bassayisi = 0, temp;
		int[] dizi;
		String girilensayi;
		Scanner klavye = new Scanner(System.in);
		girilensayi = klavye.next();
		bassayisi = girilensayi.length();
		dizi = new int[bassayisi];
		sayi = Integer.parseInt(girilensayi);
		for (int i = 0; i < bassayisi; i++) {
			dizi[i] = sayi % 10;
			sayi /= 10;
		}
		int m = bassayisi - 1;
		for (int j = 0; j < Math.pow(m, 2); j++) {
			for (int i = 0; i < bassayisi - 1; i++) {
				if (dizi[i] < dizi[i + 1]) {
					temp = dizi[i];
					dizi[i] = dizi[i + 1];
					dizi[i + 1] = temp;
				}
			}
		}
		int num=0;
		int k=bassayisi-1;
		for (int i = 0; i < bassayisi; i++) {
			num+=dizi[i]*Math.pow(10, k);
			k--;
		}
		System.out.println(num);
		klavye.close();
	}

}
