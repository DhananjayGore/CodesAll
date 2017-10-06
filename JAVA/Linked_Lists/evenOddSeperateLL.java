import java.util.*;

class evenOddSeperateLL 
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

	void seperate(Node root)
	{
		Node p1=root;Node p2=root;
		int temp=0;
		while(p1!=null && p2!=null)
		{
			while(p1!=null && p1.data%2==1)
			{
				p1=p1.next;
			}
			if(p2!=null && p2.data%2==0)
			{
				p2=p2.next;
			}
			if (p1!=null && p2!=null) 
			{
			temp=p1.data;
			p1.data=p2.data;
			p2.data=temp;	
			}
			
		}
	}

	public static void main(String[] args) {
		evenOddSeperateLL l=new evenOddSeperateLL();
		Scanner sc=new Scanner(System.in);
		int x=0;
		while(x!=-1)
		{
			x=sc.nextInt();
			if (x!=-1) {
				l.insert(l.head,x);
			}
		}

		l.printlist(l.head);
		l.seperate(l.head);
		l.printlist(l.head);

	}
	
}