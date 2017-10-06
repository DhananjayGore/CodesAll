
public  class maxProdSubA 
{

static int max(int a,int b)
{
	return (a>b)? a:b;
}

static int min(int a,int b)
{
	return (a<b)? a:b;
}

static int maxProd(int[] a)
{
	int l=a.length;
	int maxg=1,maxl=1,minl=1;

	int i=0;

	for (i=0;i<l;i++) 
	{
		if (a[i]>0) 
		{
		maxl=maxl*a[i];
		minl=min(minl*a[i],1);	
		}
		else if (a[i]==0) 
		{
		minl=1;
		maxl=1;	
		}
		else
		{
			int temp=maxl;
			maxl=max(minl*a[i],1);
			minl=temp*a[i];
		}

		if (maxg < maxl) 
		{
		maxg=maxl;	
		}	
	}
	return maxg;
}

public static void main(String[] args) {
	 int a[] = {1, -2, -3, 0, 7, -8, -2};
	 System.out.println(maxProd(a));
}

}
	
