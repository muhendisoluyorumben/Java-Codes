/**
 * '*' karakteri ile ucgen cizen program. 
 * @author Murat
 * 
 * 03.03.2021 / 17.53
 **/
import java.util.Scanner;

public class Calisma027_UcgenCizimi {

	public static void main(String[] args) {
		int n;
		Scanner klavye=new Scanner(System.in);
		System.out.println("Ucgeninin yuksekligini giriniz.");
		n=klavye.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		klavye.close();

	}

}
