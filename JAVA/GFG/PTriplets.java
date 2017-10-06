import java.util.*;
import java.lang.*;
import java.io.*;

public class PTriplets {
	public static void main (String[] args) {
		//code
		int n,test,count=1;
		Scanner sc=new Scanner(System.in);
		int[] arr;
		
		test=sc.nextInt();
		while(count<=test)
		{
		    n=sc.nextInt();
		    arr=new int[n];

		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		
		    if(pythagoras(arr,n))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    count++;
		}
	}
	
	static boolean pythagoras(int[] arr,int n)
	{
	    Arrays.sort(arr);
	    for(int i=0;i<n;i++)
	        arr[i]=arr[i]*arr[i];
	    //for(int i=0;i<n;i++)
	    //System.out.println(arr[i]);

	    int low,high;

	    for(int i=n-1;i>1;i--)
	    {
	        low=0;
	        high=i-1;

	        while(low<high)
	        {
	            //System.out.println(arr[low]+" - "+arr[high]+" "+arr[i]);
	            if(arr[low]+arr[high]==arr[i])
	            {
	                return true;
	            }
	            else if(arr[low]+arr[high]<arr[i])
	            low++;
	            else if(arr[low]+arr[high]>arr[i])
	            high--;
	          
	        }
	    }
	    return false;
	}
}