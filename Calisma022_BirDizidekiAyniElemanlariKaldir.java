package Calismalar;
/**
 * Bir dizide tekrarli olan elemanlari kaldiran program.
 * @author Murat
 * 21.02.2021 / 10.52
 */
public class Calisma022_BirDizidekiAyniElemanlariKaldir {

	public static void main(String[] args) {
		int boyut,sayac=0;
		boyut=(int) (Math.random()*10)+1; // [1,10] arasinda sayi olusturur.
		int[] dizi=new int[boyut];
		int[] sondizi;
		
		for(int i=0;i<boyut;i++) {
			dizi[i]=(int) (Math.random()*(10-5))+5;  // [5,10) arasinda sayi uretir.
		}
		
		System.out.println("Dizinin ilk hali:  ");
		diziyazdir(dizi);
			
		for(int i=0;i<boyut-1;i++) {  // dizinin elemanlarini kendi icerisinde karsilastiriyoruz. Ve her seferinde karsilastirdiðimiz sayilar birbirine esitse birini 0' esitliyoruz
			for(int j=i+1;j<boyut;j++) {
				if(dizi[i]==dizi[j]) {
					dizi[i]=0;
					sayac++;  // 0' a esitlediðimiz sayilarý ekrana yazdirmayacagimizdan dolayý 0' larin sayisini olcuyoruz.
					break;
				}
			}
		}
		
		sondizi=new int[boyut-sayac];  // 0'larý yamzayacagimizdan dolayi eski dizinin boyutundan 0' ýn sayisini cikariyoruz
		int j=0;
		for(int i=0;i<boyut;i++) {
			if(dizi[i]!=0) {  // eger dizi deki eleman 0' a esit degilse sondizi' ye atýyoruz. 0' sa atmýyoruz. Cunku yazmayacagiz.
				sondizi[j]=dizi[i];
				j++;
			}
			
		}
		System.out.println("Dizinin son hali:  ");
		diziyazdir(sondizi);
	}

	private static void diziyazdir(int[] diz) {
		for(int veri:diz) {
			System.out.print(" "+veri);
		}
		System.out.println("");
	}

	

}
