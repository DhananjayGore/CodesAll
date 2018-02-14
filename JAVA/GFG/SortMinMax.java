import java.util.*;
import java.io.*;
import java.lang.*;

public class SortMinMax{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int[] a=new int[k];
		for (int i=0;i<k;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		

		int[] b=new int[k];
		int i=0,x=0,y=k-1;
		while(x<k-1 && y>0 && i<=k-1){
			if (i<=k-1) {
			b[i]=a[x];
			x++;
			i++;
		}
			if (i<=k-1) {
				b[i]=a[y];
			y--;
			i++;
			}
			
		}

		for (int d:b) {
			System.out.print(d);
		}
	}
	
}