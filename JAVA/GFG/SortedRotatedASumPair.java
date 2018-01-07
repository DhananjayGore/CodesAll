import java.util.*;

public class SortedRotatedASumPair {

	static void finder(int[] a,int pivot,int sum){
		int l=a.length;
		int high=l-1;
		if (pivot != -1) {
			high=pivot;
		}

		int low=(pivot+1)%l;
		int count=0;
		while(low!=high){
			if (a[low]+a[high] > sum) {
				if (high==0) {
					high=l-1;
				}
				else {
					high--;
				}
			}
			else if (a[low]+a[high] < sum) {
				low=(low+1)%l;
			}
			else {
				// System.out.println(low+" "+high);
				System.out.println(a[low]+" "+a[high]);
				count++;
				low=(low+1)%l;

				if (high==0) {
					high=l-1;
				}
				else {
					high--;
				}

			}
		}

		if (count==0) {
			System.out.println("soeee");
		}


	}

	static int findPivot(int[] a,int low,int high){
		if (high < low) {
			return -1;
		}
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
		System.out.println("Sum to search");
		int s=sc.nextInt();

		finder(a,p,s);
	}
	
}