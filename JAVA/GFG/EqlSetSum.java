import java.util.*;

public class EqlSetSum{
static	boolean find(int[] a)
	{
		int l=a.length;
		Arrays.sort(a);
		int[] left=new int[l];
		int[] right=new int[l];

		int i;
		left[0]=a[0];
		for(i=1;i<l;i++)
		{
			left[i]=left[i-1]+a[i];
		}

		// for(int j:left)
		// System.out.print(j+" ");

		// System.out.println("finish");

		right[l-1]=a[l-1];
		for(i=l-2;i>-1;i--)
		{
			right[i]=right[i+1]+a[i];
		}

		for (i=0;i<l-1;i++) 
		{
		if (left[i]==right[i+1]) {
				return true;
			}	
		}

		// for(int k:right)
		// System.out.print(k+" ");
return false;
}

	public static void main(String[] args) {
		int[] a={3, 1, 1, 2, 2};

		Arrays.sort(a);
		// for(int i:a)
		// System.out.print(i+" ");
		System.out.print(find(a));
}
}

