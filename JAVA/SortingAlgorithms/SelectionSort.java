import java.util.*;
import java.lang.*;

//select a minimum for each index from the unsorted array

public class SelectionSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for (int i=0;i < n;i++) {
			int min=i;//assign current as min
			for (int j=i;j<n;j++) {
				if(a[j] < a[min]){
					min=j;
				}
			}
			if (min != i) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}