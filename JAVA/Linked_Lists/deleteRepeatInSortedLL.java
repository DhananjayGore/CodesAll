
import java.util.*;
// 1 1 1 2 2 2 3 4 -1
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

public class deleteRepeatInSortedLL
{
	Node head;


	void sortedInsert(Node root,int x)
	{
		Node new1=new Node(x);

		if (root==null) {
			head=new1;
			return;
		}
		else
		{
			Node prev=null;
			Node curr=root;

			while(curr!=null && curr.data < x)
			{
				prev=curr;
				curr=curr.next;
			}

			if (prev!=null) {
			prev.next=new1;
			new1.next=curr;				
			}
			else
			{
				new1.next=root;
				head=new1;
			}
		}
	}

	void print(Node head)
	{
		if (head==null) 
		{
			return;			
		}
		else
		{
			System.out.print(head.data+" ");
			print(head.next);
		}
	}

	// void deleterepeat(Node root)
	// {
	// 	if (root==null) {
	// 		return;
	// 	}
	// 	Node curr=root;
	// 	while(curr.next!=null)
	// 	{
	// 		if(curr.next!=null && curr.data==curr.next.data)
	// 		{
	// 			curr.next=curr.next.next;
	// 		}
	// 		else
	// 		{
	// 			curr=curr.next;
	// 		}
	// 	}
		
	// }

	void deleterepeat(Node root)
	{
		if (root==null) {
			return;			
		}
		else
		{
			Node start=root,end=root;
			Node prev=root;

			while(end!=null)
			{
				while(end!=null && end.data == start.data)
				{
					prev=end;
					end=end.next;
					// System.out.print("inner");
				}

				if (end!=null) {
					start.next=prev.next;
					start=start.next;
					end=start;
					prev=start;
					System.out.print("del");
				}
				if (prev.next==null) {
					start.next=prev.next;
					break;
					
				}
				

			}
		}
	}

	public static void main(String[] args) {
		deleteRepeatInSortedLL l=new deleteRepeatInSortedLL();
		Scanner sc=new Scanner(System.in);
		int x=0;
		do
		{
			x=sc.nextInt();
			if (x!=-1) {
				l.sortedInsert(l.head,x);
			}
			
		}while(x!=-1);

		l.print(l.head);
		l.deleterepeat(l.head);
		System.out.print("after delete ");
		l.print(l.head);
	}

}