import java.util.*;
import java.io.*;
import java.lang.*;

//print nth number in a number system with 3 n 4 as base numbers

public class NumComb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();



		
		Integer n=k;
		
// 	for (n=2;n<=k+2 ;n++) {

// 		String s=Integer.toBinaryString(n);
// 		int l=s.length();
		
// 		for (int i=1;i<=l-1;i++ ) {
// 			if (s.charAt(i)=='0') {
// 				System.out.print(3);
// 			}
// 			else {
// 				System.out.print(4);
// 			}
// 		}
// 		System.out.println();
// }
		n=n+2;
	String s=Integer.toBinaryString(n);

		int l=s.length();
		System.out.println(s);
		
		for (int i=1;i<=l-1;i++ ) 
		{
			if (s.charAt(i)=='0') {
				System.out.print(3);
			}
			else {
				System.out.print(4);
			}
		}
		System.out.println();







	}
	
}