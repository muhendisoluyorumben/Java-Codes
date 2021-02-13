package Calismalar;

/**
 * Ýki veya daha fazla basamaklý bir sayýnýn tersten yazýlýþý kendisine
 * eþitse bu sayýya 'Blur Sayýsý' denir. Klavyeden girilen bir deðerin
 * blr sayý olup olmadýðýný bulan ekrana yazan program.
 *
 * @author Murat
 * 
 * 11.02.2021 / 23.12
 */

import java.util.Scanner;

public class Calisma015_BlurSayi {

	public static void main(String[] args) {

		String sayi;  // sayýmýzý string olarak okuyoruz. eðer bir sayi deðiþkeni (int ,double...) olarak okusaydýk ayrýca basamak sayýsý için ayriyeten 
					//bir iþlem yapmak zorunda olacaktýk ama bu þekilde .length koduyla boyutunu kolayca ölçebiliyoruz
		char[] terssayi,düzsayi; // char türünde iki tane dizi oluþturuyoruz. Birine okuduðumuz sayýnýn düz halini diðerine de ters halini atayacaðýz
		System.out.println("yazý giriniz");
		Scanner klavye= new Scanner(System.in);
		sayi=klavye.nextLine();  // sayýsý string olarak okuyoruz
		
		terssayi =new char[sayi.length()];   // dizilerin boyutlarýný sayýnýn uzunluðu kadar yapýyoruz
		düzsayi =new char[sayi.length()];
		
		int m=0;  // bu deðiþkeni bu for döngüsünde kullanýyoruz.
		for(int i=sayi.length()-1;i>=0;i--) {  // bu döngüde string deðerimizin elemanlarýný sondan baþlayarak atýyoruz.
			terssayi[m]=sayi.charAt(i);  // Stringi char' a çevirme.  Burda dizimizin indisini de i deðiþkeni
			m++;                        /*olarak alsaydýk sayýyý ters çevirmiþ olmazdýk. Farklý bir m deðiþkeni oluþturduk
						* ve dizimizn indisini m deðiþkeni yaptýk.i indisi azalýrken m indisi artýyor. Bu sayede 5 basamaklý 
						*bir sayýda string deðerimizin 4. indisini dizimizin 0. indisine atýyoruz. Yani sayýyý ters çeviriyoruz.  
						*/
			}

		
		for(int i=0;i<=sayi.length()-1;i++) {
			düzsayi[i]=sayi.charAt(i);  // Stringi char' a çevirme. stirng ve char karþýlaþtýrmasý 
										//yapamadýðýmýzdan sayýnýn düz halini de bir char dizisine atýyoruz ve dizileri karþýlaþtýrýyoruz
			}
		
		
		for(int i=0;i<sayi.length();i++) {
			if(terssayi[i]!=düzsayi[i]) {  //sayýnýn ters ve düz halinde eðer herhangi bir deðiþken farklýysa bundan sonrakii deðiþkenlere bakmadan ekrana hemen yazýyý yazýp döngüden çýkar.
				System.out.println("Blur sayýsý deðildir");
				break;
			}else {  // herhangi bir deðiþken farklý deðilse m deðerini bir attýr.
				m++;
			}
		}
		if(m>sayi.length()) {  // döngü bitti ve çýktý. Biz döngü de m deðerini farklýlýk yoksa her seferinde arttýrdýk.
			System.out.println("Blur sayýsý"); /*Aslýnda m deðeri yukarýda sstring deðerin yani sayýnýn uzunluðk deðerine
			                 *ulaþtý. Ters sayýyý diziye atarken m deðerini string in uzunluðu kadar arttýrmýþtýk. 
			                 *Ýþte bu döngüde de m deðerini saýlar ayný olduðu sürece arttýrdýk ve sayýnýn uzunluðundan 
			                 *büyük bir hale geldi.
			                 */
		}
		klavye.close();
	}

}
