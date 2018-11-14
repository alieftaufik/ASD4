public class BinarySearching {

	public static void binarySearch(double[] arr, int first, int last, double key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Elemen yang anda cari terdapat pada index : " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Elemen tidak ditemukan");  
		   }  
		 }  
		 public static void main(String args[]){  
		        double arr[] = {14.0 , 33.1 , 27.2 , 10.3 , 35.4 , 19.5 , 42.6 , 44.7};  
		        double key = 10.3;  
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,key);     
		 }
}
