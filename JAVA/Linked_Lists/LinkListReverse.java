import java.util.*;

public class LinkListReverse
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
    /////////////////////////////////////////////////////////////////////
    // void insert(int x)
    // {
    // Node newnode= new Node(x);
    // newnode.next=head;
    // head=newnode;
    // }

    void insert(int x)
    {
    	Node p,prev=null;
    	Node new1=new Node(x);
    	p=head;
    	while(p!=null)
    	{
    		prev=p;
    		p=p.next;
    	}

    	if (prev==null) {
		head=new1;    		
    	}
    	else
    	{
    		prev.next=new1;
    	}
    }
    ////////////////////////////////////////////////////////////////////
    void printlist()
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

    void LReverse(Node head)
    {
    	if(head==null)
    	{
    		return;
    	}
    	else
    	{
    		LReverse(head.next);
    		System.out.print(head.data);
    	}
    }
    ////////////////////////////////////////////////////////////////////
public static void main(String[] args) {
	

//TODO code application logic here
        Scanner sc= new Scanner(System.in);
        LinkListReverse l1= new LinkListReverse();
        int x=0;
        while(x!=-1)
        {
        x=sc.nextInt();
        if(x!= -1)
        l1.insert(x);
        }
        
        l1.printlist();
        l1.LReverse(l1.head);

       
        
    }
    
}
