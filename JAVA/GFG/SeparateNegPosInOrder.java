import java.util.*;
public class SeparateNegPosInOrder {

	static void separate(int[] a){
		int l=a.length;

		int i=l-1,j=l-1;

		while(i>0 && j>0){
			System.out.println("in loop");
			if (a[i] > 0) {
				
			}
			else {
				i--;
			}

			if (a[j] < 0) {
				
			}
			else {
				j--;
			}

			if (a[i] > 0 && a[j] < 0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;

				i--;
				j--;
			}
		}

		for (int k=0;k<l;k++) {
			System.out.print(a[k] +" ");
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
		int a[]={1,-2,3,-4,5};

		separate(a);
	}
	
}