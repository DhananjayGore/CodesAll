import java.util.*;
public class add2LL
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

    Node add2ll(Node root1,Node root2)
    {
    	add2LL l=new add2LL();
    	Node p=l.head;int prevCarry=0,carry=0,sum=0;
    	while(root1!=null && root2!=null)
    	{	sum=root1.data+root2.data+carry;
    		carry=0;
    		
    		if (sum >= 10) 
    		{
    			carry=sum/10;
    			sum=sum%10;
    		}
    		l.insert(sum);
    		root2=root2.next;
    		root1=root1.next;
    		System.out.println("loop1");
    	}
    	if (root1==null) 
    	{
    		while(root2!=null)
    		{
    			if (carry==1) {
    				l.insert(root2.data+carry);
    				root2=root2.next;
    				carry=0;
    			}
    			else
    			{
    				l.insert(root2.data);
    				root2=root2.next;
    			}
    			
    			System.out.println("loop2");
    		}
    		
    	}
    	if (root2==null) 
    	{
    		while(root1!=null)
    		{
    			if (carry==1) 
    			{
    			l.insert(root1.data+carry);
    			root1=root1.next;
    			carry=0;
    			}
    			else
    			{
    			l.insert(root1.data);
    			root1=root1.next;
    			}
    			System.out.println("loop3");
    		}
    		
    	}

    	return l.head;
    }

    public static void main(String[] args) {
    	add2LL l1=new add2LL();
    	add2LL l2=new add2LL();
    	add2LL l3=new add2LL();
    	int x=0;
    	Scanner sc=new Scanner(System.in);
    	do
        {
            x=sc.nextInt();
            if (x!=-1) {
                l1.insert(x);
            }
            
        }while(x!=-1);

        do
        {
            x=sc.nextInt();
            if (x!=-1) {
                l2.insert(x);
            }
            
        }while(x!=-1);

        l3.head=l1.add2ll(l1.head,l2.head);
        l3.printlist(l3.head);


    }

}