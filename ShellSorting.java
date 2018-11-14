import java.util.Arrays;

public class ShellSorting {

	public static void main(String[] args) {
		Double[] bilangan = {14.0 , 33.1 , 27.2 , 10.3 , 35.4 , 19.5 , 42.6 , 44.7};
		int jarak=8;
		
		System.out.println("DATA AWAL : "+Arrays.toString(bilangan));
		System.out.println();
		System.out.println("PROSES BUBBLE SORT :");
		System.out.println();
		
		for(int a = 0; a < bilangan.length; a++) {
			if (jarak>1) {
				jarak/=2;
			}
			
			for(int b = 0; b < bilangan.length-jarak; b++) {
				if(bilangan[b] > bilangan[b+jarak]) {
					Double temp = bilangan[b];
					bilangan[b] = bilangan[b+jarak];
					bilangan[b+jarak] = temp;
				
				System.out.println("STEP->"+", MIN = "+bilangan[b+1]+" SWAP("+(a+1)+","+bilangan[b+1]+")"+" -> "+Arrays.toString(bilangan));
			}
		}
			
			System.out.println("");
		}
		
		System.out.println("HASIL SORTING BUBBLE : "+Arrays.toString(bilangan));
		}
	}
