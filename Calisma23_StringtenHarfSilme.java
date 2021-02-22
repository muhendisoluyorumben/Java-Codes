/**
 * Girilen String bir degerden belirlenen bir karakteri cikaran program.
 * 
 * @author Murat
 * 
 * 22.02.2021 / 23.07
 */
 
import java.util.Scanner;

public class Calisma23_StringtenHarfSilme {

	public static void main(String[] args) {
	
	String mesaj, sil;
	char silChar;
	Scanner klavye=new Scanner(System.in);
	int sayac=0;
	
	System.out.println("Mesajinizi yaziniz");
	mesaj=klavye.nextLine();
	
	char[] dizi=new char[mesaj.length()];    
	for(int i=0;i<mesaj.length();i++) {  // String degisken uzerinde degisiklik yapmak icin tum karakterleri char cinsinde bir diziye tek tek atıyoruz.
		dizi[i]=mesaj.charAt(i);         // aslinda String metodlariyla String degisken uzerinde degisiklik yapabiliyoruz ama oralari daha ogrenmedik.
	}
	
	System.out.println("Silmek istediğiniz karakter nedir?");  // silinecek karakterin kullanicidan alinmasi ve silinmesi olayi
	sil=klavye.next();
	silChar=sil.charAt(0);
	for(int i=0;i<mesaj.length();i++) {
		if(dizi[i]==silChar) {
			dizi[i]='.';        // aslinda silmek yerine yerini belli etmek icin o karakter yerine . koyuyoruz
			sayac++;
		}
	}
	 
	if(sayac==0) {
		System.err.printf("%nSilmek istediginiz karakter girdiginiz mesajda bulunmamaktadir!%n");
	}else {
	System.out.print("Silinen karalter sayisi: "); System.err.println(sayac);
	System.err.println(". ' nın oldugu yerler silinen karakterin yerini gösterir");
	for(int i=0;i<mesaj.length();i++) {
		System.out.print(dizi[i]);
	}
	}
	klavye.close();
	}

}
