package Calismalar;

import java.util.Scanner;

/**
 * x bir pozitif bir say� olmak �zere  x*(x+1) bi�iminde elde edilen say�lara
 * heterotermik sayilar denir. 1*(1+1)=2 gibi. Klavyeden girilen bir aral�ktaki
 * heterotermik say�lar� bulan ve ekrana yazan program.
 * @author Murat
 * 12.02.2021 / 15.52
 */
public class Calisma016_HeterotermikSayi {


	public static void main(String[] args) {
		int  ustdeger,altdeger;
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("Altdegeri giriniz");
		altdeger=klavye.nextInt();
		System.out.println("Ust degeri giriniz");
		ustdeger=klavye.nextInt();
		
		for(int i=1;(i*(i+1))<ustdeger;i++) {
			if(altdeger<=i*(i+1)&&i*(i+1)<=ustdeger) {
				System.out.println(i*(i+1));
			}
		}
		klavye.close();
	}

}
