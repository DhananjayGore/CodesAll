import java.util.*;
public class reverseInGroupsLL
{
	class Node{
	int data;
	Node next;

	Node(int x)
	{
		data=x;
		next=null;
	}
}

	Node head;

	void insert(int x){
    Node newnode= new Node(x);
    newnode.next=head;
    head=newnode;
}
    ////////////////////////////////////////////////////////////////////
    void printlist(){
        Node n=new Node(-1);
        n=head;
    while(n!=null)
    {
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
    System.gc();
    }

	Node reverseX(Node root,int k)
	{

		Node p=root;

		Node curr=root;
		Node prev=null;
		Node next=null;
		Node temp=null;
		int i=0;

		while (i!=k && curr!=null) {
			if (i==0) {
				temp=curr;
			}
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			i++;
		}
		if (i==k) {
			temp.next=reverseX(curr,k);
		}
		return prev;
	}

	public static void main(String[] args) {
		reverseInGroupsLL l=new reverseInGroupsLL();
		Scanner sc= new Scanner(System.in);
        int x=0;
        while(x!=-1)
        {
        x=sc.nextInt();
        if(x!= -1)
        l.insert(x);
        }
        // l.printlist();
        l.head=l.reverseX(l.head,3);
        l.printlist();
	}
}