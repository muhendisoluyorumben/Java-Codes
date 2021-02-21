
/**
 * Çarpma islemini toplama ile yapan program.
 * @author Murat
 * 10.02.2021 / 13.13
 */
import java.util.Scanner;

public class Calisma013_TopÝleÇarpmaYap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1,sayi2,sonuc=0,gecici;
		Scanner klavye= new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		sayi1=klavye.nextInt();
		System.out.println("Ýkinci sayiyi giriniz");
		sayi2=klavye.nextInt();
		
		if(sayi1>sayi2) {
			gecici=sayi1;
			sayi1=sayi2;
			sayi2=gecici;		
		}
		
		for(int i=1;i<=sayi1;i++) {
			sonuc+=sayi2;
		}
		System.out.println("Sonuc "+sonuc);
	
		klavye.close();
	}
	
}
