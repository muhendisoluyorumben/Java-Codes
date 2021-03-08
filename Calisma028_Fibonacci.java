
/**
 * Fibonaci dizisinin elemanlarini ekrana yazan program. 
 * @author Murat
 * 
 **/
public class Calisma028_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibonacci=new int[10];
		fibonacci[0]=0;
		fibonacci[1]=1;
		int i=2;
		while(i<10) {
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			i++;
		}
		for(int m=0;m<10;m++) {
			System.out.print(" "+fibonacci[m]);
		}
	}

}
