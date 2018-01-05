import java.util.*;
import java.io.*;
import java.lang.*;

public class sumOfFactors{

	static int sum(int s){
		int res=0;
		for (int i=2;i<=Math.sqrt(s);i++) {
			if (s%i==0) {
				if (i==s/i) {
					res=res+i;
					System.out.println(i);
				}
				else {
					res=res+i+(s/i);
					System.out.println(s/i);
				}
			}
		}
		res=res+s+1;
		return res;
	}


	public static void main(String[] args) {
		int s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		int x= sum(s);
		System.out.println("sum of factors of "+s+" is "+ x);
	}
	
}