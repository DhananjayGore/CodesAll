import java.util.*;

public class pairwiseSwapLL {

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
		Node new1=new Node(x);
		new1.next=head;
		head=new1;
	}

	void print(Node head)
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


	void pairwiseSwap(Node head)
	{
		
		if (head==null || head.next==null) {
			return;
		}
		Node first=head;
		Node second=first.next;
		Node temp2;
		while(first !=null && first.next != null)
		{
			int temp=first.data;
			temp2=first;
			first.data=second.data;
			second.data=temp;

			first=temp2.next.next;
			second=first.next;
		}
	}


	public static void main(String[] args) {
		pairwiseSwapLL l1 = new pairwiseSwapLL();
		Scanner sc=new Scanner(System.in);

		int x=0;
        while(x!=-1)
        {
        x=sc.nextInt();
        if(x!= -1)
        l1.insert(x);
        }

		l1.print(l1.head);

		l1.pairwiseSwap(l1.head);
		l1.print(l1.head);
	}
	
}