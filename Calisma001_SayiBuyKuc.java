package Calismalar;
/*
 * 2 say�dan b�y�k olan� bulup ekrana yazan program
 * 17.11.2020 Sal� 20.10 
 */

public class Calisma001_SayiBuyKuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, buyuk = 0;
		a = 115;
		b = 15;
		if (a < b) {
			buyuk = b;
			System.out.println("Buyuk olan sayi= " + buyuk);
		} else if (a == b) {
			System.out.print("Sayilarin ikisi de birbirine esit. Bak sayilar bunlar  -->  " + a + " , " + b);
		} else {
			buyuk = a;
			System.out.print("Buyuk olan sayi= " + buyuk);
		}
	}

}
