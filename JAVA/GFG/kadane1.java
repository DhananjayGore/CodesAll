import java.util.*;
import java.lang.*;

public class kadane1 {

	static void kadane(int[] a)
	{
		int l=a.length;
		System.out.println(l);


		int b[]=new int[l];int i;

		int cmax,gmax;cmax=gmax=a[0];

		b[0]=a[0];

		for (i=1;i<l;i++) 
		{
		b[i]=Math.max(a[i],a[i]+b[i-1]);

		if (b[i]>gmax) 
		{
			gmax=b[i];	
		}

		}

		for(int j:a)
			System.out.print(j+" ");

		System.out.println();
		
		for(int j:b)
			System.out.print(j+" ");
		System.out.println();
		System.out.println(gmax);


	}

	public static void main(String[] args) {
		int[] a={1,1,-3,4,5,6,7,8,9};//{-2,3,2,-1};
		// int l=a.length;
		// System.out.println(l);
		kadane(a);
	}
	
}