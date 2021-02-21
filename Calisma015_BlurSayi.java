/**
 * İki veya daha fazla basamaklı bir sayının tersten yazılışı kendisine
 * eşitse bu sayıya 'Blur Sayısı' denir. Klavyeden girilen bir değerin
 * blr sayı olup olmadığını bulan ekrana yazan program.
 *
 * @author Murat
 * 
 * 11.02.2021 / 23.12
 */

import java.util.Scanner;

public class Calisma015_BlurSayi {

	public static void main(String[] args) {

		String sayi;  // sayımızı string olarak okuyoruz. eğer bir sayi değişkeni (int ,double...) olarak okusaydık ayrıca basamak sayısı için ayriyeten 
					//bir işlem yapmak zorunda olacaktık ama bu şekilde .length koduyla boyutunu kolayca ölçebiliyoruz
		char[] terssayi,düzsayi; // char türünde iki tane dizi oluşturuyoruz. Birine okuduğumuz sayının düz halini diğerine de ters halini atayacağız
		System.out.println("yazı giriniz");
		Scanner klavye= new Scanner(System.in);
		sayi=klavye.nextLine();  // sayısı string olarak okuyoruz
		
		terssayi =new char[sayi.length()];   // dizilerin boyutlarını sayının uzunluğu kadar yapıyoruz
		düzsayi =new char[sayi.length()];
		
		int m=0;  // bu değişkeni bu for döngüsünde kullanıyoruz.
		for(int i=sayi.length()-1;i>=0;i--) {  // bu döngüde string değerimizin elemanlarını sondan başlayarak atıyoruz.
			terssayi[m]=sayi.charAt(i);  // Stringi char' a çevirme.  Burda dizimizin indisini de i değişkeni
			m++;                        /*olarak alsaydık sayıyı ters çevirmiş olmazdık. Farklı bir m değişkeni oluşturduk
						* ve dizimizn indisini m değişkeni yaptık.i indisi azalırken m indisi artıyor. Bu sayede 5 basamaklı 
						*bir sayıda string değerimizin 4. indisini dizimizin 0. indisine atıyoruz. Yani sayıyı ters çeviriyoruz.  
						*/
			}

		
		for(int i=0;i<=sayi.length()-1;i++) {
			düzsayi[i]=sayi.charAt(i);  // Stringi char' a çevirme. stirng ve char karşılaştırması 
										//yapamadığımızdan sayının düz halini de bir char dizisine atıyoruz ve dizileri karşılaştırıyoruz
			}
		
		
		for(int i=0;i<sayi.length();i++) {
			if(terssayi[i]!=düzsayi[i]) {  //sayının ters ve düz halinde eğer herhangi bir değişken farklıysa bundan sonrakii değişkenlere bakmadan ekrana hemen yazıyı yazıp döngüden çıkar.
				System.out.println("Blur sayısı değildir");
				break;
			}else {  // herhangi bir değişken farklı değilse m değerini bir attır.
				m++;
			}
		}
		if(m>sayi.length()) {  // döngü bitti ve çıktı. Biz döngü de m değerini farklılık yoksa her seferinde arttırdık.
			System.out.println("Blur sayısı"); /*Aslında m değeri yukarıda sstring değerin yani sayının uzunluğk değerine
			                 *ulaştı. Ters sayıyı diziye atarken m değerini string in uzunluğu kadar arttırmıştık. 
			                 *İşte bu döngüde de m değerini saılar aynı olduğu sürece arttırdık ve sayının uzunluğundan 
			                 *büyük bir hale geldi.
			                 */
		}
		klavye.close();
	}

}
