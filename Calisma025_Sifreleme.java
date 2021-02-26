package Calismalar;
/**
 * Mesaj sifreleme programi.
 * 
 * @author Murat
 *
 * 25.02.2021 / 09.00-13.10
 */
import java.util.Random;
import java.util.Scanner;

public class Calisma025_Sifreleme 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner klavye=new Scanner(System.in);
		String girilenMesaj;
		char[] mesajHarfleri,cozulmusCumle,
		alfabe= {'a','b','c','ç','d','e','f','g','ð','h','ý','i','j','k','l','m','n','o','ö','p','r','s','þ','t','u','ü','v','y','z'};
		int[] sifreliCumle;
		int[] sifre=new int[alfabe.length];
		int[] buyukHarfKonumu ;    // mesaj icerisinde buyuk harflerin konumu atayacagýmýz dizi.
		
		sifreOlusturma(sifre,alfabe.length);  
		
		System.out.printf("%nMesajiniz:%n");
		girilenMesaj=klavye.nextLine();
		mesajHarfleri=new char[girilenMesaj.length()];
		sifreliCumle=new int[girilenMesaj.length()];
		cozulmusCumle=new char[girilenMesaj.length()];
		buyukHarfKonumu=new int[girilenMesaj.length()];  // mesajdaki harflerin hepsinin de buyuk olma ihtimali oldugundan dolayi buyuklugunu girilenmesaj in buyuklugu kadar ayarliyoruz
		
		for(int i=0;i<girilenMesaj.length();i++) // mesajdaki harflerin hepsinin ayri ayri sifresini cozmek icin hepsini tek tek char a ceviriyoruz.
			mesajHarfleri[i]=girilenMesaj.charAt(i);
		
		
		for(int i=0;i<girilenMesaj.length();i++) 
		{
			for(int j=0;j<alfabe.length;j++)
			{
				if(mesajHarfleri[i]==alfabe[j])   // eger mesajdaki harflerden biri bizim kucuk harflerden olusan dizimizde var mi?
				{
					// Evet.
					buyukHarfKonumu[i]=0;      // O zaman BuyukHarfKonumu dizisinde ,mesajda bu harfin bulundugu indis degerini, 0 ata.
					sifreliCumle[i]= sifre[j]; // bu harfin sifresini de sifreliCumle dizisine ata.
				}
				else 
				{
					// Hayir
					alfabe[j]=Character.toUpperCase(alfabe[j]);  // bu harflerden biri bizim dizimizde yoksa bizim kucuk harflerden olusan dizimizdeki butun karakterleri buyuk harfe cevir ve tekrar bak. Var mi?
					if(mesajHarfleri[i]==alfabe[j]) 
					{
						buyukHarfKonumu[i]=1;   // varsa BuyukHarfKonumu dizisinde ,mesajda bu harfin bulundugu indis degerini, 1 ata.
						sifreliCumle[i]= sifre[j]; // bu harfin sifresini de sifreliCumle dizisine ata.
					}
				}
				alfabe[j]=Character.toLowerCase(alfabe[j]);  // alfabemizdeki karakterleri tekrar kucuk hale getir.
			}
		}
		
		System.out.printf("%nSifreli Mesaj:%n");  // bizim mesajimizin sifreli hali.
		for(int i=0;i<girilenMesaj.length();i++) 
			System.out.print(sifreliCumle[i]);
		
		
		for(int i=0;i<girilenMesaj.length();i++) 
		{
			for( int j =0;j<alfabe.length;j++) 
			{
				if(1==buyukHarfKonumu[i]) 
				{  // Ilk once harfin buyuk olup olmadigina bakiyoruz.
					alfabe[j]=Character.toUpperCase(alfabe[j]);  // buyukse bizim alfabemizi buyutuyoruz.
					if(sifreliCumle[i]==sifre[j])// sifreliCumle dizisindeki sayi sifre dizisindeki degerle eslesince
						cozulmusCumle[i]=alfabe[j];  // cozulmusCumle dizisine alfabemizden harfi atýyoruz.
				}else 
				{  
					alfabe[j]=Character.toLowerCase(alfabe[j]); // harf buyuk degilse yukaridaki islemleri alfabe yi kuculterek tekrarliyoruz.
					if(sifreliCumle[i]==sifre[j]) 
						cozulmusCumle[i]=alfabe[j];
				}
			}
		}
		System.out.println(" ");
		System.out.printf("%nSifre Cozuldu. Tebrikler!%n");
		for(int i=0;i<girilenMesaj.length();i++) 
		{
			System.out.print(cozulmusCumle[i]);
		}
		
	/*  System.out.println(" ");     buyuk harflerin yerini kotrol etmek icin yazilmis bir kod blogu.
		for(int i=0;i<BuyukHarfKonumu.length;i++) {
			System.out.println(" "+BuyukHarfKonumu[i]);
		}
	*/
		klavye.close();
	}
	
	
	public static int[] sifreOlusturma(int[] diziSifre , int uzunluk) 
	{
		Random rand=new Random();
		for(int i=0;i<uzunluk;i++) 
		{
			diziSifre[i]=rand.nextInt(1000+1)-1;
			System.out.print(" "+diziSifre[i]);// programin dogru calisip calismadigini kontrol etmek icin sifreyi de ekrana yazdiriyoruz.
		}
		return diziSifre;
	}

}
