
import java.util.*;

public class splitToAlternateLL 
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

    void split(Node head)
    {
        splitToAlternateLL l1=new splitToAlternateLL();
        splitToAlternateLL l2=new splitToAlternateLL();

        while(head!=null)
        {   
            if (head!=null) 
            {
                l1.insert(head.data);
                 System.out.println("inserted"+head.data+" to l1");
                 head=head.next;
            }
            
            if(head!=null)
            {
                l2.insert(head.data);
                System.out.println("inserted"+head.data+" to l2");
                head=head.next;
            }
        }

        l1.printlist(l1.head);
        l2.printlist(l2.head);
    }

    public static void main(String[] args) {
        splitToAlternateLL l=new splitToAlternateLL();
        int x=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            x=sc.nextInt();
            if (x!=-1) {
                l.insert(x);
            }
            
        }while(x!=-1);

        l.split(l.head);
    }
}
