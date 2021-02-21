
/*
 * x>1 ve y>1 olmak üzere x^y + y^x biçiminde oluşturulan sayılara Leyland Sayı denir
 * Klavyeden girilen x ve y değerlerine (x ve y dahil) kadar Leyland sayıları hesaplayıp
 * ekrana yazan program.
 * 
 * 06.02.2021 / 12. 18
 * MRT
 */
import java.util.Scanner;
public class Calisma006_LeylandSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		System.out.println("x değerini giriniz");
		x=okuma();
		System.out.println("y değerini giriniz");
		y=okuma();
		
		System.out.println("Leyland Sayılar: ");
		for(int i=2;i<=x;i++) {
			for(int j=2;j<=y;j++) {
				System.out.print(" "+(int)(Math.pow(i,j)+Math.pow(j, i)));
			}
		}
		
	}

	public static int okuma() {
		Scanner klavye=new Scanner(System.in);
		int m;
		
		do {
		m=klavye.nextInt();
		if(m>1) 
			break;
		else 
			System.err.println("1' den büyük değer giriniz");
		}while(true);
		
		return m;
	}

}
