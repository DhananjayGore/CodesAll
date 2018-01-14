import java.util.*;
import java.io.*;
import java.lang.*;

//Find the closest pair from two sorted arrays

public class ClosestPairFrom2SortedAs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("M");
		m=sc.nextInt();
		

		System.out.println("a1");
		int[] a = new int[m];
		for (int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}

		System.out.println("a2");
		System.out.println("N");
		n=sc.nextInt();
		int[] b = new int[n];
		for (int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}

		System.out.println("x");
		int x=sc.nextInt();

		Arrays.sort(a);
		Arrays.sort(b);

		int min=Integer.MAX_VALUE;

		// System.out.println(min);

		int i=0,j=n-1;
		while(i < m && j >= 0){
			if (Math.abs(a[i]+b[j]-x) < min ) {
				min = Math.abs(a[i]+b[j]-x); 
			}

			if (a[i]+a[j] > x ) {
				j--;
			}
			else{
				i++;
			}
		}

		System.out.println(min);

	}
}