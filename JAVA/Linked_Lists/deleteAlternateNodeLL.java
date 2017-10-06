
import java.util.*;

public class deleteAlternateNodeLL  {
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

    void insert(int x)
    {
    Node newnode= new Node(x);
    newnode.next=head;
    head=newnode;
    }
    ////////////////////////////////////////////////////////////////////
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

    void deleteAlt(Node head)
    {
    	Node n=head;
    	if (n==null || n.next==null) {
    		return ;
    	}
    	else
    	{
    		Node temp=head,curr=null;

    		while(temp!=null && temp.next!=null)
    		{
    			curr=temp;
    			temp.next=temp.next.next;
    			temp=curr.next;
    		}
    	}
    }

    public static void main(String[] args) {
    	deleteAlternateNodeLL l=new deleteAlternateNodeLL();
    	int x=0;
    	Scanner sc=new Scanner(System.in);
    	do
		{
			x=sc.nextInt();
			if (x!=-1) {
				l.insert(x);
			}
			
		}while(x!=-1);

		l.printlist(l.head);
		l.deleteAlt(l.head);
		l.printlist(l.head);
    }
	
}