import java.util.*;
// Max Occuring Char in a char
public class MaxOccuringChar {

	static int SIZE=256;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ca=s.toCharArray();
		findMaxOccurChar(ca);
	}

	static void findMaxOccurChar(char[] a){
		int l=a.length;
		int[] count=new int[SIZE];
		int max=0;
		int index=-1;
		for (int i=0;i<l;i++) {
			count[a[i]]=count[a[i]]+1;
			if (count[a[i]]>max) {
				max=count[a[i]];
				index=i;
			}
		}

		System.out.println(max+" "+a[index]);

	}
}
