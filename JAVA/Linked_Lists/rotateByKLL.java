import java.util.*;
class rotateByKLL 
{
	class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}

	Node head;

	void insert(Node root,int x)
	{
		Node new1=new Node(x);
		new1.next=head;
		head=new1;
	}

	void printlist(Node root)
	{
		Node p=root;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

	void rotate(Node root,int k)
	{
		Node temp=root;Node prev=null;
		Node new1=null;int count=0;
		if (root==null) {
			return;
		}
		while(temp!=null && count!=k)
		{
			temp=temp.next;
			count++;
			// System.out.print("l1 ");
		}

		if(temp==null)
		{
			return;
		}
		else
		{
			prev=temp;
		while(temp.next!=null)
		{
			temp=temp.next;
			// System.out.print("l2 ");
		}

		temp.next=head;
		head=prev.next;
		prev.next=null;
		}
		
	}

public static void main(String[] args) {
	rotateByKLL l1=new rotateByKLL();
	Scanner sc=new Scanner(System.in);
		int x=0;
		while(x!=-1)
		{
			x=sc.nextInt();
			if (x!=-1) {
				l1.insert(l1.head,x);
			}
		}
		l1.printlist(l1.head);
		l1.rotate(l1.head,2);
		l1.printlist(l1.head);
}
	
}