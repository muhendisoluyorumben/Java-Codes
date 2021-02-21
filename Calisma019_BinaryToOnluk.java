/**
 * Klavyeden girilen binary degeri onluk deger ceviren program
 * @author Murat
 * 14.02.2021 / 13.06
 */
import java.util.Scanner;

public class Calisma019_BinaryToOnluk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary;  
		int binarykoruma,onluk = 0, gecici = 0,sayac = 0,rakamkontrol;
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("İkilik bir deger gir.");
		do {
			sayac = 0;
			binary = klavye.next();  // Sayiyi string olarak okuyoruz cunku eğer integer okursak basamak sayısını .length metoduyla elde edmiyoruz. Ayriyeten anlasilmasi zor bir kod blogu yazmak zorunda kaliyoruz. Bu yuzden string olarak okuduk
			rakamkontrol = Integer.parseInt(binary);  //  sayiyinin ustunde islem yapacagimizdan dolayi sayiyi integer degere donusturuyoruz.
			// rakamkontrol = Integer.valueOf(binary);  // istersek boyle de döndurebiliriz. parseInt() metodu daha hizli oldugu icin bunu bu şekilde yazdik.
			
			
			for (int i = 0; i < binary.length(); i++) {  //butun sayilari kontrol edebilmek icin bu kod blogunu yazdik
				rakamkontrol = rakamkontrol / 10;   // burda sayinin tüm rakakmlarini kontrol etmek icin 10 'a bolerek en sagdaki basamagini(birler) yok ediyoruz.
				if (0 != rakamkontrol % 10 && 1 != rakamkontrol % 10) { // burda herhangi bir basamaktaki sayimiz 0 ve 1 'den herhangi birine esit degilse sayac degerini 1 attrıyoruz.
					sayac++;    
				}
			}
			
			if (sayac == 0) // sayac degerine bakıyoruz eger sayac 0 ' a esitse tum sayilarin 0 ya da 1 oldugu anlamina geliyor ve bir daha kullanicidan deger almiyoruz.
				break;
			else 
				System.out.println("0 ve 1 lerden oluşan bir sayı yaz");  // ekrana yaziyi yaziyor ve tekrar deger okuyoruz.
			
		} while (true);

		binarykoruma = Integer.parseInt(binary);  // son olarak okuduguuz sayiyi tekrar farkli bir integer degiskene atıyoruz. Yukari atamistik ama o degiskeni tekrar kullanamayiz cunku onun üstünde islem yaptik ve o sayi artik bizim kullanicidan ladigimiz degerden farkli bir deger oldu.
									// bunu yukari da degilde burda yazmamizin nedeni. Yukarida yapsaydik her yanlis giriste bosuna atayacaktik. Cunku bu degiskeni yukarida degil burda kuulaniyoruz.
		for (int i = 0; i < binary.length(); i++) {
			gecici = binarykoruma % 10;  // sayiyinin her seferinde birler basamagini aliyoruz
			onluk += (long) (gecici * Math.pow(2, i));
			binarykoruma = binarykoruma / 10; // her seferinde sayinin birler basamagini yok etmek icin 10' a boluyoruz. 
		}
		
		System.out.println("onluk sayi =  " + onluk);
		klavye.close();
	}

}
