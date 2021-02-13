package Calismalar;

import java.util.Scanner;

/**
 * x bir pozitif bir sayý olmak üzere  x*(x+1) biçiminde elde edilen sayýlara
 * heterotermik sayilar denir. 1*(1+1)=2 gibi. Klavyeden girilen bir aralýktaki
 * heterotermik sayýlarý bulan ve ekrana yazan program.
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
