
/*
 * f=1+ 1/2 + 2/3 + 3/4 + .. +n/(n+1)
 * serisini klavyeden girilen n deðerine kadar hesaplayan program.
 * 
 * 06.02.2021 / 11.30
 * MRT
 */
import java.util.Scanner;
public class Calisma003_fSerisi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye= new Scanner(System.in);
		int nDegeri;
		float fDegeri=1.0f;
		System.out.println("N degerini griniz");
		nDegeri=klavye.nextInt();
		
		for(float i=1;i<=nDegeri;i++) {
			fDegeri=fDegeri+(i/(i+1));
		}
		System.out.print("F degeri :  "+fDegeri);

		klavye.close();

	}
}
