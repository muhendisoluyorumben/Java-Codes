package Calismalar;

/*
 * Sadece iki basamakl� iki do�al say�n�n birler basama��ndaki rakamlar�n toplam� 10 ve onlar basama��ndaki 
 * rakamlar� ayn� ise bu iki say�ya ba�da�k say� denir. Klavyeden girilen iki say�n�n ba�da��k say� olup 
 * olmad���n� ekrana yazan program.
 * 
 * 06.02.2021 / 12.57
 * MRT
 */
import java.util.Scanner;
public class Calisma007_BagdasikSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1,sayi2;
		Scanner klavye = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz");
		sayi1=klavye.nextInt();
		System.out.println("�kinci say�y� giriniz");
		sayi2=klavye.nextInt();
		
		if((int)sayi1/10==(int)sayi2/10) {
			if(0==(sayi1+sayi2)%10)
				System.out.println("Ba�da��k say�lard�r");
			else
				System.out.println("Ba�da��k say�lar de�illerdir.");
		}else {
			System.out.println("Ba�da��k say�lar de�illerdir");
		}
		klavye.close();
	}

}
