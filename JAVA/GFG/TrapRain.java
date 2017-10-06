import java.util.*;
import java.lang.*;
import java.io.*;
public class TrapRain
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner scanner = new Scanner(System.in);
	    int test_case = scanner.nextInt();
	    for(int i=0;i<test_case;i++){
	        int X = scanner.nextInt();
	        int[] arr1 = new int[X];
	       for(int j=0;j<X;j++){
	            arr1[j]=scanner.nextInt();
	        }
	        
	        System.out.println(TRW(arr1));
	    }
	 }
	 
	 private static int TRW(int[] arr){
	     int[] left = new int[arr.length];
	     int right[] = new int[arr.length];

	     int sum=0;
	     left[0]=arr[0];
	     
	     for(int i=1;i<arr.length;i++){
	         left[i]=Math.max(left[i-1],arr[i]);
	     }//kadane inc LtoR

	     int n = arr.length;
	     right[n-1]=arr[n-1];
	     for(int i=n-2;i>=0;i--){
	         right[i]=Math.max(arr[i],right[i+1]);
	     }//kadane inc RtoL


	     int temp;
	     for(int i=0;i<arr.length;i++){
	         
	             temp = Math.min(left[i],right[i]);
	             
	             sum+=temp-arr[i];
	         
	     }
	     return sum;
	 } 
}