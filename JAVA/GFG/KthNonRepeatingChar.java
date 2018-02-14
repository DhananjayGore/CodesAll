// Kth Non Repeating Char
import java.util.*;
public class KthNonRepeatingChar {
	static int SIZE=256;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ca=s.toCharArray();
		System.out.println("k");
		int k=sc.nextInt();

		findKth(ca,k);
	}

	static void findKth(char[] a,int k){
		int l=a.length;
		int[] count=new int[SIZE];
		for (int i=0;i<l;i++) {
			count[a[i]]=count[a[i]]+1;
		}
		char c=' ';
		for (int i=0;i<l;i++) {
			if (count[a[i]]==1) {
				k--;
				if (k==0) {
					System.out.println((char)(a[i]));
					return;
				}
			}
		}

	}
}