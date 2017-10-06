
class LinkedList
{
    Node head;  // head of list
  
    /* Linked list Node*/
    class Node
    {
        char data;
        Node next;
        Node(char d) {data = d; next = null; }
    }
 
                     
 
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
    public void push(char new_data)
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
    void printList(Node root)
    {
        Node temp =root;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }

    int compare(Node root1,Node root2)
    {
        int x=-2;
        while(root1!=null && root2!=null)
        {
            if(root1.data > root2.data)
            {
                x=-1;
                break;
            }
            else if (root1.data < root2.data) 
            {
                x=1;
                break;
            }
            else
            {
                root2=root2.next;
                root1=root1.next;
                x=0;
            }
        }
        return x;
    }
 
     /* Drier program to test above functions */
    
} 

public class stringCompareLL
{

    public static void main(String args[])
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
         
        /* Constructed Linked List is 1->2->3->4->5->6->7->
           8->9->null */
        l1.push('a');
        l1.push('b');
        l1.push('c');
        l1.push('d');
        l2.push('a');
        l2.push('b');
        l2.push('c');
        l2.push('d');
        l1.push('e');
        // l2.push('f');
        // l2.push('g');
        // l2.push('h');
        // l1.push();
        // l1.push(1);
         
        System.out.println("l1");
        l1.printList(l1.head);
        System.out.println("l2");
        l2.printList(l2.head);
        int x=l1.compare(l1.head,l2.head);
        System.out.println(x+" is the result");

    }
}
/* This code is contributed by mahi */