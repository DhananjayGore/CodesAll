import java.util.*;
import java.lang.*;
import java.io.*;
public class buySell
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i0=0;i0<t;i0++)
	    {
	        int n = sc.nextInt();
	        int a[] = new int[n];

	        for(int j=0;j<n;j++)
	        {
	            a[j] = sc.nextInt();
	        }

	        int buy = -1;
	        int sell = -1;

	        int i = 0;
	        int count = 0;

	        while(i < n-1)
	        {
	            while(i<n-1 && (a[i+1]<=a[i]))
	            {
	                i++;
	            }
	            if(i == n-1)
	            {
	                
	                break;
	            }
	            buy = i;
	            i++;
	            while(i<n && a[i]>a[i-1])
	            {
	                i++;
	            }
	            sell = i-1;
	            System.out.print("("+buy+" "+sell+") ");
	            count++;
	                
	        }
	        if(count == 0)
	            System.out.print("No Profit");
	        System.out.println();
	        
	    }
	 }
}