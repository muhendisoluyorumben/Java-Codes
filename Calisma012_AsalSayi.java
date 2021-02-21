

/**
 * Asal sayý bulan program
 * @author Murat
 * 07.02.2021 / 21.25
 */
public class Calisma012_AsalSayi {

	public static void main(String[] args) {
		int sayac;
		System.out.println("1 Asal Deðildir");
		for(int j=2;j<100;j++) {
			sayac=0;
			for(int i=2;i<j;i++) {
				if(0==j%i) {
					sayac++;
				}
			}
			if(sayac>0)
				System.out.println(j +" Asal deðildir");
			else
				System.out.println(j +" Asaldýr");
		}
		
	}

}
