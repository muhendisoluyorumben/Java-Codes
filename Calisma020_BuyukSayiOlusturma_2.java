public class  Calisma020_BuyukSayiOlusturma_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5646,numkorumasi=0,bassayisi=0,temp;
		int[] dizi;
		numkorumasi=num;
		do {
			num=num/10;
			bassayisi++;
			if(num<1) {
				break;
			}
		}while(true);
		dizi=new int[bassayisi];
		for (int i = 0; i < bassayisi; i++) {
			dizi[i] = numkorumasi % 10;
			numkorumasi /= 10;
		}
		int m = bassayisi - 1;
		for (int j = 0; j < Math.pow(m, 2); j++) {
			for (int i = 0; i < bassayisi - 1; i++) {
				if (dizi[i] < dizi[i + 1]) {
					temp = dizi[i];
					dizi[i] = dizi[i + 1];
					dizi[i + 1] = temp;
				}
			}
		}
		int numa=0;
		int k=bassayisi-1;
		for (int i = 0; i < bassayisi; i++) {
			numa+=dizi[i]*Math.pow(10, k);
			k--;
		}
		System.out.println(numa);
	}

}
