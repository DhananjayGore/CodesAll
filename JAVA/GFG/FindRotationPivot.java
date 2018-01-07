import java.util.*;

public class FindRotationPivot{

	static int findPivot(int[] a,int low,int high){
		// if (high < low) {
		// 	return -1;
		// }

		

		int mid=(high+low)/2;
		// System.out.println(mid);

		// 1 element or 2 elements
		if (high==low || mid == low) {
			return low;
		}


		if (mid < high && a[mid] > a[mid+1]) {
			return mid;
		}

		if (low < mid && a[mid] < a[mid-1]) {
			return mid-1;
		}

		if (a[low] >= a[mid]){
			return findPivot(a,low,mid-1);
		}

		return findPivot(a,mid+1,high);
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a = new int[n];

		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		int p=findPivot(a,0,n-1);
		System.out.println(p);
	}
	
}