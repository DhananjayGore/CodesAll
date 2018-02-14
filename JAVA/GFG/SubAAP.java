import java.util.*;

//Program to print the largest subarray that is longer than 2 and is in Arithmatic progression

public class SubAAP {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];

		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		int cdp=a[1]-a[0],cdn=0;
		int start=0,end=0;
		int startg=0,endg=0;
		int count=1;

		
		int z=0;
		int max=0;



		for (int i=2;i<n;i++) {
			while(i<n && a[i]-a[i-1]==cdp){
				count++;
				// System.out.println(count);
				end=i;
				i++;
			}

			if (count>=2) {
				// for (int j=start;j<=end;j++) {
				// 	System.out.print(a[j]+" ");
				// }
				// System.out.println();
				if (endg-startg > start-end) {
					startg=start;
					endg=end;
				}



				// System.out.println();
				if (end<n-1) {
					start=end;
					end=end;
					count=0;
					cdp=a[i]-a[i-1];
					z++;
				}
			}
			else
			{
				if (end<n-1) {
					start=end+1;
					end=end+1;
					count=1;
					cdp=a[i]-a[i-1];
					z++;
				}
			}
		}
		// System.out.println(startg+" "+ endg);
		for (int i=startg;i<=endg ;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}