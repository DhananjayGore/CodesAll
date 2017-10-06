
import java.util.*;

public class intersectionOfSortedLL
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

	void printlist(Node head)
    {
        Node n=new Node(-1);
        n=head;
    while(n!=null)
    {
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
    }

    Node intersect(Node root1,Node root2)
    {
    	intersectionOfSortedLL l=new intersectionOfSortedLL();

    	while(root1 != null && root2 !=null)
    	{
    		if (root1.data > root2.data) {
				root2=root2.next;    			
    		}
    		else if (root1.data < root2.data) {
				root1=root1.next;    			
    		}
    		else
    		{
    			l.sortedInsert(l.head,root1.data);
    			root1=root1.next; 
    			root2=root2.next; 
    		}
    	}
    	return l.head;
    }

    public static void main(String[] args) {
    	intersectionOfSortedLL l1 =new intersectionOfSortedLL();
    	intersectionOfSortedLL l2 =new intersectionOfSortedLL();
    	intersectionOfSortedLL l3 =new intersectionOfSortedLL();
    	int x=0;
    	Scanner sc=new Scanner(System.in);
    	do
		{
			x=sc.nextInt();
			if (x!=-1) {
				l1.sortedInsert(l1.head,x);
			}
			
		}while(x!=-1);

		do
		{
			x=sc.nextInt();
			if (x!=-1) {
				l2.sortedInsert(l2.head,x);
			}
			
		}while(x!=-1);
		l3.head=l1.intersect(l1.head,l2.head);
		l3.printlist(l3.head);



		


    }
}