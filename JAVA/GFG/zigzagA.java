import java.util.*;
import java.lang.*;
import java.io.*;

public class zigzagA {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=s.nextInt();
		    int[] arr=new int[n];
		    for(int j=0;j<n;j++)
		        arr[j]=s.nextInt();
		    boolean flag=true;
		    int temp=0;
	        for(int k=0;k<=n-2;k++)
	        {
	            if (flag)  /* "<" relation expected */
                {
                    /* If we have a situation like A > B > C,
                   we get A > B < C by swapping B and C */
                    if (arr[k] > arr[k+1])
                    {
                        // swap
                        temp  = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                 
                }
                else /* ">" relation expected */
                {
                    /* If we have a situation like A < B < C,
                   we get A < C > B by swapping B and C */
                    if (arr[k] < arr[k+1])
                    {
                        // swap
                        temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                }
                flag = !flag; 
	        }
	        for(int a=0;a<n;a++)
		        System.out.print(arr[a]+" ");
		    System.out.println();
		}
	}
}