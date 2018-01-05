import java.util.*;
import java.lang.*;

public class InsertionSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for (int i=0;i < n-1;i++) {
			int value=a[i];
			int hole=i;
			while(hole>0 && a[hole-1]>value){
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole]=value;
		}
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}