package Calismalar;

/**
 * Geçici temp deðeri oluþturmadan iki deðerin yerini deðiþtirme
 * @author Murat
 * 07.02.2021 / 20.57
 */
public class Calisma011_TempNotÝkiSayýDeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8,b=56,toplam=0;
		System.out.println("ilk halleri");
		System.out.println("a: "+a+" b: "+b);
		toplam=a+b;
		b=toplam-b;
		a=toplam-b;
		System.out.println("son halleri");
		System.out.println("a: "+a+" b: "+b);
	}

}
