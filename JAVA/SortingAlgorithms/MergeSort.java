import java.util.*;
import java.lang.*;

public class MergeSort{

	static int[] msort(int[] a,int low,int high){
		int mid=(low+high)/2;
		if (low<high) {
			a=msort(a,low,mid);
			a=msort(a,mid+1,high);
			merge(a,low,mid,high);
		}
		return a;
	}

	static int[] merge(int[] a,int low,int mid,int high){
		int j, k, i;
		int[] b=new int[a.length];

	   for(j = low, k = mid + 1, i = low; j <= mid && k <= high; i++) {
	      if(a[j] <= a[k])
	         b[i] = a[j++];
	      else
	         b[i] = a[k++];
	   }
	   
	   while(j <= mid)    
	      b[i++] = a[j++];

	   while(k <= high)   
	      b[i++] = a[k++];

	   for(i = low; i <= high; i++)
	      a[i] = b[i];

  		return a;
	} 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		a=msort(a,0,n-1);

		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}