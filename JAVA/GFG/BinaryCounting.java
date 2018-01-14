import java.util.*;
import java.io.*;
import java.lang.*;

public class BinaryCounting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n;
		n=sc.nextInt();
		int l=Integer.toBinaryString(n).length();

		for (Integer i=1;i<=n;i++) {
			String s=Integer.toBinaryString(i);
			if (s.length()<l){
				for (int k=0;k<l-s.length();k++) {
					System.out.print('0');
				}
			}
			System.out.println(s);
		}
	}
}