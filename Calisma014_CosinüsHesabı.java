import java.util.Scanner;

/**
 * cos(x) = 1 - x^2/2! + x^4/4! - x^6/6!+ ... + (-1)^N*x^2N/(2N)!+...
 * Klavyeden bir x(derece cinsinden) ve N degerlerini 
 * alip cos(x) degerini hesaplayan ve ekrana yazan program
 * @author Murat
 *
 */
public class Calisma014_CosinüsHesabý {

	public static void main(String[] args) {
	double fonk=1,terim=1;
	int x,n;
	
	Scanner klavye=new Scanner(System.in);
	
	System.out.println("Açýyý giriniz");
	x=klavye.nextInt();
	System.out.println("Hassasiyeti giriniz");
	n=klavye.nextInt();
	
	for(int i=1;i<=n;i++) {
		terim=(-1)*terim*Math.pow(0.01746*x, 2);
		fonk=fonk+(terim/faktoriyel(i));
	}
	System.out.printf("Cevap %.3f",fonk);
	klavye.close();
	}

	private static double faktoriyel(int fak) {
		fak=fak*2;
		int faktor=1;
		for(int i=1;i<=fak;i++) {
			faktor=faktor*i;
		}
		return faktor;
	}

}
