
import java.util.*;

public class deleteRepeatInUnsortedLL
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
    void insert(int x)
    {
    Node newnode= new Node(x);
    newnode.next=head;
    head=newnode;
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
    ///////////////////////////////////////////////////////////////////
    void removeDuplicate(Node head) 
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();
     
        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) 
        {
            int curval = current.data;
             
             // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
 
    }

    public static void main(String[] args) {
    	deleteRepeatInUnsortedLL l1 = new deleteRepeatInUnsortedLL();
    	Scanner sc= new Scanner(System.in);
        
        int x=0;
        while(x!=-1)
        {
        x=sc.nextInt();
        if(x!= -1)
        l1.insert(x);
        }
        
        l1.printlist();
        l1.removeDuplicate(l1.head);
        l1.printlist();
    }
}