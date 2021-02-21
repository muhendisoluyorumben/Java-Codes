

/*
 * Sadece iki basamaklı iki doğal sayının birler basamağındaki rakamların toplamı 10 ve onlar basamağındaki 
 * rakamları aynı ise bu iki sayıya bağdaık sayı denir. Klavyeden girilen iki sayının bağdaşık sayı olup 
 * olmadığını ekrana yazan program.
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
		System.out.println("İlk sayıyı giriniz");
		sayi1=klavye.nextInt();
		System.out.println("İkinci sayıyı giriniz");
		sayi2=klavye.nextInt();
		
		if((int)sayi1/10==(int)sayi2/10) {
			if(0==(sayi1+sayi2)%10)
				System.out.println("Bağdaşık sayılardır");
			else
				System.out.println("Bağdaşık sayılar değillerdir.");
		}else {
			System.out.println("Bağdaşık sayılar değillerdir");
		}
		klavye.close();
	}

}
