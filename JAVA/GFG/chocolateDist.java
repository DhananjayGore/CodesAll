import java.util.*;

public class chocolateDist
{

	static int dist(int[] a,int n,int s)
	{
		Arrays.sort(a);
// System.out.println();
// 		for(int i:a)
// 		{
// 			System.out.print(i +" ");
// 		}
// 		System.out.println();
		int min=Integer.MAX_VALUE;
		for (int i=0;i < n-s+1;i++)
		{
			int x=(a[i+s-1]-a[i]);
			//System.out.println(x);

			if(x < min)
			{
				min=x;
			}	
		}
		return min;
	}



public static void main(String[] args) 
{
	int t;
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	if (t<1 || t>100) 
	{
	return;	
	}

	while(t-->0)
	{
		int n=sc.nextInt();
		if (n<1 || n>100) 
		{
		return;	
		}//size
		int a[]=new int[n];

		for (int i=0;i<n;i++) //reading
		{
		a[i]=sc.nextInt();	
			if (a[i]<1 || a[i]>100) 
			{
			return;	
			}
		}

		int s=sc.nextInt();

		int result=dist(a,n,s);
		System.out.println(result);
	}

	
}
	
}