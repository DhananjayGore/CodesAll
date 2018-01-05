import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int z=0;z<testcase;z++) {
		    int n = sc.nextInt();
		    if(palindrome(n))
		        System.out.println(n);
	        else {
	            int flag=0;
	            for(int i=0;i<5;i++) {
	                n = reverse(n);
	                if(palindrome(n)) {
	                    System.out.println(n);
	                    flag=1;
	                    break;
	                }
	            }
	            if(flag==0)
	            System.out.println("-1");
	        }
		}
	}
	public static int reverse(int num) {
	    int val=0;
	    int a = num;
	    while(num>0) {
	        val = (val*10) + (num%10);
	        num = num/10;
	    }
	    return (a+val); 
	}
	public static boolean palindrome(int a) {
	    String s = String.valueOf(a);
	    StringBuilder sb = new StringBuilder(s);
	    String rev = sb.reverse().toString();
	    return (s.equals(rev));
	}
}