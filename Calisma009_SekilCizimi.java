
/**
   Ekrana * 
          **  
          *** 
 	  ****
	  *****
	  Benzeri þekilleri çizen program.
  @author Murat
  07.02.2021 / 14.53
 */
public class Calisma009_SekilCizimi {

	public static void main(String[] args) {

		
		// Kumsaati Çizimi:
		
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				for (int m = 0; m < 5; m++)
					System.out.print("* ");
				System.out.println("");
			}
			for (int j = 0; j < 7; j++) {
				if (j == 5 - i || j == i) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			if (i == 5) {
				for (int m = 0; m < 5; m++)
					System.out.print("* ");
			}
		}
		System.out.printf("%n%n");

		
		//Kare çizimi:
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i < 5 && i > 0) {
					if (j == 0 || j == 5) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				if (i == 0 || i == 5) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");

		// Artýrarak * iþareti koyma:
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		// Azaltarak * iþareti koyma
		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
