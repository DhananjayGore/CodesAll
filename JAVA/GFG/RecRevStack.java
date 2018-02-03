import java.util.Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

public class RecRevStack {
	static Stack<Integer> s = new Stack<>();

	static void reverse(){
		if (s.size()==0) {
			return;
		}
		else {
			int x=s.peek();//save the current
			s.pop();//remove
			reverse();//reverse the remaining
			insertAtBottom(x);
		}
	}

	static void insertAtBottom(int x){
 
        if(s.isEmpty())
            s.push(x);
 
        else{
            int a = s.peek();
            s.pop();
            insertAtBottom(x);
            s.push(a);
        }
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int size;
		size=sc.nextInt();
		
		int i=0;
		while(i<size){
			int x=sc.nextInt();
			s.push(x);
			i++;
	}
	reverse();

	while (!s.isEmpty()) {
		int c=s.peek()	;
		System.out.println(c);
		s.pop();
	}
}
	
}
