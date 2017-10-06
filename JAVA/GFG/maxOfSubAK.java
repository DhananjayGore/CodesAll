import java.util.*;
import java.lang.*;
import java.io.*;

public class maxOfSubAK {
	public static void main (String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int m = 0; m < t; m++) 
        {
    	    int n = sc.nextInt();//size of array
    	    int k = sc.nextInt();//size of subA
    	    int[] arr = new int[n];
    	    
    	    for(int j = 0; j < n; j++) 
            {
    	        arr[j] = sc.nextInt();//reading
    	    }
    	    
    	    for(int i = 0; i <= n - k; i++) 
            {
    	        int max = Integer.MIN_VALUE;

    	        for(int j = 0; j < k; j++) 
                {
    	            if(arr[i+j] > max) 
                    {
    	                max = arr[i+j];
    	            }
    	        }
    	        System.out.print(max + " ");
    	    }
    	    
    	    System.out.println();
    	}
	}
}