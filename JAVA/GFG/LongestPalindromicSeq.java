import java.util.*;

// Program to print the largest Palindromic sequence in the given String
public class LongestPalindromicSeq {
	static void lPS(char[] ca){
		int n=ca.length;
		boolean[][] table=new boolean[n][n];

		int maxL=1;
		int max=0,start=0;
		for (int i=0;i<n;i++) {
			table[i][i]=true;
		}

		max=1;
		
		for (int i=0;i<n-1;i++ ) {
			if (ca[i]==ca[i+1]) {
				table[i][i+1]=true;
				max=2;
				start=i;
			}
		}

		for (int i=2;i<n;i++) {
			for (int j=i-1;j>=0;j--) {
				if (table[j+1][i-1] && ca[i]==ca[j]) {
					table[j][i]=true;
						if (i-j+1 > max) {
                        start = j;
                        max = i-j+1;
                    }
				}
			}
		}

// System.out.println(max);
	// System.out.println(start);
	for (int i=start;i<start+max;i++ ) {
		System.out.print(ca[i]);
	}
	System.out.println();
	
///////////////////////////////////////////////////////////////////////////////////////////
//Uncomment to see the matrix

		// for (int i=0;i<n;i++) {
		// 	for (int j=0;j<n;j++) {
		// 		if (table[i][j]) {
		// 			System.out.print(table[i][j]+" ");
		// 		}
		// 		else{
		// 			System.out.print("     ");
		// 		}
		// 	}
		// 	System.out.println();
		// }

///////////////////////////////////////////////////////////////////////////////////////////
		// number of character to be added in front to make a string palindrome




// int num1=0,num2=0;
// for (int i=n-1;i>=0;i--) {
// 	if (table[0][i]==true) {
// 		num1=n-i-1;
// 		break;
// 	}
// 	// System.out.println(table[0][i]);
// }

// for (int i=0;i<n;i++) {
// 	if (table[i][n-1]) {
// 		num2=i;
// 		break;
// 	}
// }
// System.out.println(num1+" " +num2);

// System.out.println(Math.min(num2,num1) + " front add");

////////////////////////////////////////////////////////////////////////////////////////////

}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ca=s.toCharArray();

		lPS(ca);
	}
}