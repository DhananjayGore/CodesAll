import java.util.*;
class checkIdenticalLL
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

    boolean checker(Node root1,Node root2)
    {
    	boolean flag=true;
    	while(root1!=null && root2!=null)
    	{
    		if (root1.data==root2.data) 
    		{
    		root1=root1.next;	
    		root2=root2.next;
    		}
    		else
    		{
    			flag=false;
    			break;
    		}
    	}
		if (root1==null && root2==null) 
		{
			flag=true;
		}
		return flag;
    }

    public static void main(String[] args) {
    	checkIdenticalLL l1=new checkIdenticalLL();
    	checkIdenticalLL l2=new checkIdenticalLL();
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

       boolean b= l1.checker(l1.head,l2.head);
       System.out.println(b);

    }
}