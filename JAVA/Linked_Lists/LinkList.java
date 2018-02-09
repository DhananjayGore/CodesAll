import java.util.*;
import java.io.*;
import java.lang.*;
public class LinkList {

	class Node {
		int data;
		Node next;

		Node(int x){
			data=x;
			next=null;
		}
	}

	Node root=null;

	 void insert(int x) {
		Node n=new Node(x);
		if (root==null) {
			root=n;
		}
		else{
			n.next=root;
			root=n;
		}
	}

	void reverse(){
		if (root==null) {
			return ;
		}
		else {
			Node prev=null,curr=root,nextt=null;

			while (curr!=null) {
				nextt=curr.next;
				curr.next=prev;
				prev=curr;
				curr=nextt;
			}

			root=prev;

		}
	}

	void delete(int x){
		if (root.data==x) {
			root=root.next;
		}
		else{
			Node prev=root;
			while(prev.next!=null){
				if (prev.next!=null) {
					if (prev.next.data==x) {
						break;
					}
				}
				prev=prev.next;
			}

			if (prev==null) {
				return ;
			}
			else {
				prev.next=prev.next.next;
			}
		}
	}

	void count(){
		if (root==null){
			System.out.println(0);
			return ;
		}
		else {
			Node n=root;
			int c=0;
			while (n!=null) {
				n=n.next;
				c++;
			}
			System.out.println(c);
		}
	}

	Node search(int x){
		Node n=root;
		if (n==null) {
			return root;
		}
		while (n!=null) {
			if (n.data==x) {

				return n;
				
			}
			else {
				n=n.next;
			}
		}
		return n;
	}

	 void printLL(){
		Node n=root;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		LinkList l=new LinkList();
		while (x!=-1) {
			x=sc.nextInt();
			if (x==-1) {
				break;
			}
			else{
				l.insert(x);
			}
		}
		l.printLL();
		l.count();
		System.out.println("Delete");
		int y=sc.nextInt();
		l.delete(y);
		l.printLL();
		System.out.println("search");
		y=sc.nextInt();
		if (l.search(y) != null) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		;
		System.out.println("search");
		y=sc.nextInt();
		if (l.search(y) != null) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		l.printLL();
		l.count();
		System.out.println("Rev");
		l.reverse();
		l.printLL();

	}
	
}