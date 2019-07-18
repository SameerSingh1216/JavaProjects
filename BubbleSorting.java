import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,21,2,64,25,2};
		        int n = arr.length;  
		        int temp = 0;  
		         for(int i=0; i < n; i++)
		         {  
		                 for(int j=1; j < (n-i); j++)
		                 {  
		                          if(arr[j-1] > arr[j])
		                          {  
		                                 //swap elements  
		                                 temp = arr[j-1];  
		                                 arr[j-1] = arr[j];  
		                                 arr[j] = temp;  
		                         }  
		                          
		                 } 
		         }
//		         for(int x: arr)
//		         {
//		        	 System.out.print(x + " ");
//		         }
		         System.out.println(Arrays.toString(arr));
	}

}
