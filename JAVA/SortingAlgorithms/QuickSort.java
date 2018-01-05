import java.util.*;
import java.lang.*;

public class QuickSort{

	static void qsort(int[] a,int start,int end){
		
		if (start<end) {
			int pindex=partition(a,start,end);
			qsort(a,start,pindex-1);
			qsort(a,pindex+1,end);
		}
		// return a;
	}

	static int partition(int[] a,int start,int end){
		int pivot=a[end],pindex=start;
		
		for (int i=start;i<end;i++ ) {
			if (a[i]<=pivot) {
				//swap a[i] , a[pindex]
				int temp=a[i];
				a[i]=a[pindex];
				a[pindex]=temp;

				pindex++;
			}
		}
		//swap a[pindex] p[end]
		int temp1=a[pindex];
		a[pindex]=a[end];
		a[end]=temp1;
		
		return pindex;
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		qsort(a,0,n-1);

		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}