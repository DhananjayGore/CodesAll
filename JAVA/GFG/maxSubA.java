import java.util.*;

public  class maxSubA
{
public static void main(String[] args) {
		int[] a={1, 0, 0, 1, 0, 1, 1};

		int l=a.length;

		int i;
		for ( i=0;i<l ;i++ ) 
		{
			if (a[i]==0) 
			{
				a[i]=-1;	
			}			
		}
		
		int[] sumL=new int[l];
		sumL[0]=a[0];
		for (i=1;i<l ;i++ ) 
		{
				sumL[i]=sumL[i-1]+a[i];			
		}

		for (int j:a) 
		{
		System.out.print(j+" ");	
		}

		System.out.println();

		for (int k:sumL) 
		{
		System.out.print(k+" ");	
		}

int start=0,end=l;
int max=-1;
// int j,k;

		HashMap<Integer,Integer> hm=new HashMap<>();


for (i=0;i<l-1;i++) 
{
	if (hm.containsKey(sumL[i]))
	{
		int x=hm.get(sumL[i]);
		if (x-i > max) 
			{
			max=x-i;
			end=i;	
			}
	}
	else
	{
		hm.put(sumL[i],i);	
	}
}
System.out.println();
System.out.println(end+" "+max+" "+(end-max));
}

}