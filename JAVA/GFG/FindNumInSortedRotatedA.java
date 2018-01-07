import java.util.*;

public class FindNumInSortedRotatedA{

	static int bsModified(int[] a,int pivot,int key){
		int low=0;
		int high=a.length-1;
		
	   if (pivot == -1)
           return binarySearch(a, low, high, key);

       if (a[pivot] == key)
           return pivot;

       if (a[low] <= key)
           return binarySearch(a, 0, pivot-1, key);

       return binarySearch(a, pivot+1, high, key);
	}

	static int binarySearch(int arr[], int low, int high, int key)
    {
       if (high < low)
           return -1;
        
       /* low + (high - low)/2; */      
       int mid = (low + high)/2;  
       if (key == arr[mid])
           return mid;
       if (key > arr[mid])
           return binarySearch(arr, (mid + 1), high, key);
       return binarySearch(arr, low, (mid -1), key);
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
		System.out.println("Number to search");
		int s=sc.nextInt();

		int result = bsModified(a,p,s);
		System.out.println(result);

		
	}
	
}