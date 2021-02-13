package Calismalar;

/**
 * �ki veya daha fazla basamakl� bir say�n�n tersten yaz�l��� kendisine
 * e�itse bu say�ya 'Blur Say�s�' denir. Klavyeden girilen bir de�erin
 * blr say� olup olmad���n� bulan ekrana yazan program.
 *
 * @author Murat
 * 
 * 11.02.2021 / 23.12
 */

import java.util.Scanner;

public class Calisma015_BlurSayi {

	public static void main(String[] args) {

		String sayi;  // say�m�z� string olarak okuyoruz. e�er bir sayi de�i�keni (int ,double...) olarak okusayd�k ayr�ca basamak say�s� i�in ayriyeten 
					//bir i�lem yapmak zorunda olacakt�k ama bu �ekilde .length koduyla boyutunu kolayca �l�ebiliyoruz
		char[] terssayi,d�zsayi; // char t�r�nde iki tane dizi olu�turuyoruz. Birine okudu�umuz say�n�n d�z halini di�erine de ters halini atayaca��z
		System.out.println("yaz� giriniz");
		Scanner klavye= new Scanner(System.in);
		sayi=klavye.nextLine();  // say�s� string olarak okuyoruz
		
		terssayi =new char[sayi.length()];   // dizilerin boyutlar�n� say�n�n uzunlu�u kadar yap�yoruz
		d�zsayi =new char[sayi.length()];
		
		int m=0;  // bu de�i�keni bu for d�ng�s�nde kullan�yoruz.
		for(int i=sayi.length()-1;i>=0;i--) {  // bu d�ng�de string de�erimizin elemanlar�n� sondan ba�layarak at�yoruz.
			terssayi[m]=sayi.charAt(i);  // Stringi char' a �evirme.  Burda dizimizin indisini de i de�i�keni
			m++;                        /*olarak alsayd�k say�y� ters �evirmi� olmazd�k. Farkl� bir m de�i�keni olu�turduk
						* ve dizimizn indisini m de�i�keni yapt�k.i indisi azal�rken m indisi art�yor. Bu sayede 5 basamakl� 
						*bir say�da string de�erimizin 4. indisini dizimizin 0. indisine at�yoruz. Yani say�y� ters �eviriyoruz.  
						*/
			}

		
		for(int i=0;i<=sayi.length()-1;i++) {
			d�zsayi[i]=sayi.charAt(i);  // Stringi char' a �evirme. stirng ve char kar��la�t�rmas� 
										//yapamad���m�zdan say�n�n d�z halini de bir char dizisine at�yoruz ve dizileri kar��la�t�r�yoruz
			}
		
		
		for(int i=0;i<sayi.length();i++) {
			if(terssayi[i]!=d�zsayi[i]) {  //say�n�n ters ve d�z halinde e�er herhangi bir de�i�ken farkl�ysa bundan sonrakii de�i�kenlere bakmadan ekrana hemen yaz�y� yaz�p d�ng�den ��kar.
				System.out.println("Blur say�s� de�ildir");
				break;
			}else {  // herhangi bir de�i�ken farkl� de�ilse m de�erini bir att�r.
				m++;
			}
		}
		if(m>sayi.length()) {  // d�ng� bitti ve ��kt�. Biz d�ng� de m de�erini farkl�l�k yoksa her seferinde artt�rd�k.
			System.out.println("Blur say�s�"); /*Asl�nda m de�eri yukar�da sstring de�erin yani say�n�n uzunlu�k de�erine
			                 *ula�t�. Ters say�y� diziye atarken m de�erini string in uzunlu�u kadar artt�rm��t�k. 
			                 *��te bu d�ng�de de m de�erini sa�lar ayn� oldu�u s�rece artt�rd�k ve say�n�n uzunlu�undan 
			                 *b�y�k bir hale geldi.
			                 */
		}
		klavye.close();
	}

}
