package Calismalar;
/**
 * 1'den 100'e kadar sayilarin sirayla yazili oldugu bir dizi var. Bu sayilardan hangisinin hatali oldugunu bulan program.
 * 
 * @author Murat
 *
 * 23.02.2021 / 18.46
 *
 */
import java.util.Random;

public class Calisma024_HataliSayi {

	public static void main(String[] args) {
		int[] dizi = new int[100];
		Random rand=new Random();
		
		int farkliKonumu=rand.nextInt(99); // yanlis olan sayinin konumunun her seferinde farkli olmasi icin rastgele bir sayi üretiyoruz
		int farkliSayi=rand.nextInt(1000);  // her calistirdigimizda yanlis olan sayi farkli olacak
		for(int i=0;i<100;i++) {  // diziyi olusturuyoruz
			if(i==farkliKonumu) {
				dizi[i]=farkliSayi;
			}else {
				dizi[i]=i+1;
			}	
		}
		int m=0;
		for(int i=0;i<100;i++) { 
			if(dizi[i]!=(i+1)) {
				m=i;
			}
		}
		
		for(int i=0;i<100;i++) {
			System.out.print(dizi[i]+" ");
		}
		System.out.println(" ");
		if(m!=0) {
			System.out.println((m+1)+" yazmasi gereken yerde "+dizi[m]+" yazmakta");
		}else
			System.out.println("sıkıntı yok");
	}

}
