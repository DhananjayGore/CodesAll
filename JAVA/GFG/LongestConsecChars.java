import java.util.*;
import java.io.*;
import java.lang.*;

public class LongestConsecChars {

static void finder(char[] ca){
	int l=ca.length;
	char current=ca[0],prev,max='0';
	int maxCount=0,currCount=0;

	for (int i=1;i<l;i++) {
		if (ca[i]==current) {
			currCount++;
			if (currCount>maxCount) {
				maxCount=currCount;
				max=current;
			}
		}
		else {
			prev=current;
			current=ca[i];
			currCount=1;
		}
	}
	System.out.println(max+""+maxCount);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		char[] ca=s.toCharArray();
		finder(ca);
	}
}
	
