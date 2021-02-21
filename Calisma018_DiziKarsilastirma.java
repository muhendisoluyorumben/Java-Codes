import java.util.Random;

/**
 * Boyutlari ve elemanlari rastgele olusturulan 2 dizideki elemanlari karsilastirip ayni olanlari bulan 
 * ve indisleriyle beraber ekrana yazan program.
 * @author Murat
 * 13.02.2021 / 14.24
 */

public class Calisma018_DiziKarsilastirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] diziA,diziB;
		int kontrol=0;
		
	
		diziA=new int[allocate()];	
		diziB=new int[allocate()];
		
		diziA=diziOlustur(diziA.length);
		diziB=diziOlustur(diziB.length);
		
		System.out.println("A dizisinin boyutu : "+diziA.length+"   Elemanlari:");
		diziYaz(diziA,diziA.length);
		
		System.out.printf("%n%nB dizisinin boyutu : "+diziB.length+"   Elemanlari:%n");
		diziYaz(diziB,diziB.length);
		
		
		System.out.printf("%n%nÝki dizinin ortak elemanlari:%n%n");
		for(int i=0;i<diziA.length;i++) {
			for(int j=0;j<diziB.length;j++) {
				if(diziA[i]==diziB[j]) {
					System.out.println(diziB[j]+" .....  diziA' da indisi "+i+" diziB' de indisi "+j);
					kontrol++;
				}
			}
		}
		if(kontrol==0) {
			System.err.printf("Bu iki dizinin ortak elemani yoktur.");
		}
	}
	
	public static int allocate() {  // dizilerin boyutlarini random araciligiyla belirliyoruz
		Random rand=new Random();
		int boyut=0;
		boyut=rand.nextInt(10)+1;
		return boyut;
	}

	public static int[] diziOlustur(int uzunluk) {  // dizilerin boyutlarini alip dizileri random araciligiyla olusturup geri gonderiyoruz
		Random rand=new Random();
		int[] dizi=new int[uzunluk];
		for(int i=0;i<uzunluk;i++) {
			dizi[i]=rand.nextInt(10)+1;
		}
		return dizi;
	}
	
	private static void diziYaz(int[] dizi, int uzunluk) {
		for(int i=0;i<uzunluk;i++) {
			System.out.print(" "+dizi[i]);
		}
		
	}

	

}
