package Calismalar;

/*
 * Sadece iki basamaklý iki doðal sayýnýn birler basamaðýndaki rakamlarýn toplamý 10 ve onlar basamaðýndaki 
 * rakamlarý ayný ise bu iki sayýya baðdaýk sayý denir. Klavyeden girilen iki sayýnýn baðdaþýk sayý olup 
 * olmadýðýný ekrana yazan program.
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
		System.out.println("Ýlk sayýyý giriniz");
		sayi1=klavye.nextInt();
		System.out.println("Ýkinci sayýyý giriniz");
		sayi2=klavye.nextInt();
		
		if((int)sayi1/10==(int)sayi2/10) {
			if(0==(sayi1+sayi2)%10)
				System.out.println("Baðdaþýk sayýlardýr");
			else
				System.out.println("Baðdaþýk sayýlar deðillerdir.");
		}else {
			System.out.println("Baðdaþýk sayýlar deðillerdir");
		}
		klavye.close();
	}

}
