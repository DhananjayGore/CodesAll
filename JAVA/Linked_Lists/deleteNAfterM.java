
class LinkedList
{
    Node head;  // head of list
  
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
                     
 
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
  
        /* 3. Make next of new Node as head */
        new_node.next = head;
  
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }

    void deleteMN(Node root,int m,int n)
    {
        Node p=root,curr=root,prev=null;
        int i=0,j=0;
        while(p!=null)
        {
            while(p!=null && i<m)
            {
                curr=p;
                p=p.next;
                i++;
            }
            while(p!=null && j<n)
            {
                prev=p;
                p=p.next;
                j++;
            }
            i=0;j=0;
                curr.next=p;

        }

    }
 
     /* Drier program to test above functions */
    
} 

public class deleteNAfterM
{

    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
         
        /* Constructed Linked List is 1->2->3->4->5->6->7->
           8->9->null */
        llist.push(10);
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
         
        System.out.println("Linked List before deleting");
        llist.printList();
         
        llist.deleteMN(llist.head,2,3);
 
        System.out.println("Linked List after deleting");
        llist.printList();
    }
}
/* This code is contributed by mahi */