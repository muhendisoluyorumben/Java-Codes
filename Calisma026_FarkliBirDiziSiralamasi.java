package Calismalar;

/**
 * Her biri N tane farkli tamsayi degerini tutan A ve B dizileri dusunun. Her iki dizideki 
 * degerler artan sirada siralanmistir. A ve B dizilerini C dizisinde ilk n degeri artan sirada,
 * gerikalani ise azalan sirada birlestiren program.
 * 
 * @author Murat
 *
 * 26.02.2021 / 18.26
 */
public class Calisma026_FarkliBirDiziSiralamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] diziA= {5,9,15,18,20}, diziB = {1,2,6,11,29};
		int[] diziC ;
		int[] digerDizi;
		int toplamUzunluk=0,temp=0;
		toplamUzunluk=diziA.length+diziB.length;
		digerDizi=new int[toplamUzunluk];
		diziC=new int[toplamUzunluk];
		
		for(int i=0;i<toplamUzunluk;i++) {
			if(i<=4) {  //ilk 5 indise diziA'nin degerlerini atýyoruz
				digerDizi[i]=diziA[i];
			}
			else if(i>4) {//son 5 indise diziB'nin degerlerini atýyoruz
				digerDizi[i]=diziB[i-5];
			}
		}
		
		for(int i=0;i<100;i++) {  // butun degerlerin bulundugu diziyi buyukten kucuge siraliyoruz
			for(int j=0;j<9;j++) {
				if(digerDizi[j]<digerDizi[j+1]) {
					temp=digerDizi[j];
					digerDizi[j]=digerDizi[j+1];
					digerDizi[j+1]=temp;
				}
			}
		}
		for(int i=0;i<5;i++) {  // bizden istedigi siralama ile elemanlari diziC dizisine atýyoruz.
			diziC[i]=digerDizi[(i+9)-(2*i)];// burda diziC[0] = digerDizi[8] --> diziC[1]= digerDizi[7] seklinde atama yapiyoruz.
			diziC[i+5]=digerDizi[i];   // burda da dizic[5] = digerDizi[0] --> dizi[6] = digerDizi[1] seklinde atama yapiyoruz.
		}
		for(int i=0;i<10;i++) {
			System.out.print(" "+digerDizi[i]);
		}
		System.out.println(" ");
		for(int i=0;i<10;i++) {
			System.out.print(" "+diziC[i]);
		}
	}
			
}
