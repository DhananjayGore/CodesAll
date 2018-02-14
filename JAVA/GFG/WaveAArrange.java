import java.util.*;

public class WaveAArrange{

	static void waver(int[] a){
		int l=a.length;
		int max_index=l-1,min_index=0;

		int max=a[l-1]+1;

		for (int i=0;i<l;i++) {
			if (i%2==0) {
				a[i]=a[i]+(a[max_index]%max)*max;
				max_index--;
			}
			else{
				// a[i]=a[i]+(a[min_index]%max)*max;
				a[i]+=(a[min_index]%max)*max;
				min_index++;
			}
		}
		
		for (int k=0;k<l;k++) {
			System.out.print(a[k]/max+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		// n=sc.nextInt();
		// int[] a = new int[n];

		// for (int i=0;i<n;i++) {
		// 	a[i]=sc.nextInt();
		// }
		int a[]={1,2,3,4,5};

		waver(a);
	}
	
}