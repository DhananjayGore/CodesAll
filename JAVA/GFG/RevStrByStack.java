import java.util.*;
import java.lang.*;
import java.io.*;

public class RevStrByStack{
	static Stack<Character> s=new Stack<>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		int l=str.length();
		int i=0;
		while(i<l){
			s.push(str.charAt(i));
			i++;
		}

		while (!s.isEmpty()) {
		char c=s.peek()	;
		System.out.print(c);
		s.pop();
	}
	System.out.println();
	}
	
}