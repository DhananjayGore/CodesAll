/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package linkedlisti;

import java.util.Scanner;

/**
 *
 * @author mahi
 */
public class LinkedListI {

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
    ////////////////////////////////////////////////////////////////////

    void insertAfter(int key,int val)
    {int c=0;
    Node n=new Node(-1);
    n=head;
    while(n != null)
    {
        if(n.data==key)
        {
           // System.out.println("found");
        break;   
        }     
        else
        {
        n=n.next;
        c++;
        }    
    }
    Node temp;
    if (n==null) {
        return;
    }
    else
    {
      temp=n;
    Node newnode=new Node(val);
    newnode.next=temp.next;
    n.next=newnode;  
    }
    
    }
        ////////////////////////////////////////////////////////////////////
    void insertAtEnd(int val)
    {
     Node n ;
     Node prev=new Node(-1);
    n=head;
    while(n != null)
    {
    prev=n;
    n=n.next;
    }
     Node n1=new Node(val);
     prev.next=n1;
     n1.next=null;
    
    }
         ////////////////////////////////////////////////////////////////////
    void delete(int key)
    {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key)
        {
            head = temp.next; 
            return;
        }
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }    
 
        if (temp == null) 
            return;
 
       
        prev.next = temp.next;
    }
         ////////////////////////////////////////////////////////////////////
    int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
         ////////////////////////////////////////////////////////////////////
    Node search(Node root,int key)
    {
    if(root==null)
    {
    return null;
    }
    else
    {
    Node prev=null;
    Node curr=root;
    while(curr!=null)
    {
        if(curr.data==key)
            break;
        else
        {
            prev=curr;
            curr=curr.next;
        }
    
    }
        //System.out.println(curr.data);
    return curr;
    
    }
    }
        //////////////////////////////////////////////////////////////////// 
void swapNode(int x,int y)
{
    if(x==y)
    {
    return;
    }

Node prevX=null,currX=head;
while( currX!=null && currX.data !=x )
{
prevX=currX;
currX=currX.next;
}

Node prevY=null,currY=head;
while(currY!=null &&  currY.data!=y )
{
prevY=currY;
currY=currY.next;
}
if(currX==null || currY==null)
{
return;
}

if(prevX!=null)
{
prevX.next=currY;
}
else
{
head=currY;
}

if(prevY!=null)
{
prevY.next=currX;
}
else
{
head=currX;
}

Node temp=currX.next;
currX.next=currY.next;
currY.next=temp;
}
     ////////////////////////////////////////////////////////////////////
Node getNth(Node root,int index)
{
Node temp=root;int count=1;

while(temp!=null)
{
    if (count==index) {
        return temp;
        //break;
    }
    else
    {
        temp=temp.next;
        count++;
    }
}
return null;
}
     ////////////////////////////////////////////////////////////////////
void printMiddle(Node root)
{
    Node slow=root;
    Node fast=root;
while(slow!=null && fast!=null && fast.next != null)
{
    slow=slow.next;
    fast=fast.next.next;
}

if (slow!=null) 
{
     System.out.println("mid point is "+ slow.data);   
}
}
     ////////////////////////////////////////////////////////////////////
Node nthfromLast(Node root,int x)
{

    int l=getCount( );
    if (x<l) {
        Node n=getNth(root,l-x+1);
    return n;
    }
    else 
        return null;
    
}

int freq(Node root,int key)
{
Node temp=root;int count=0;
while(temp!=null)
{
    if(temp!=null && temp.data==key)
        count++;
    temp=temp.next;
}
return count;
}
     ////////////////////////////////////////////////////////////////////
void deleteList()
{
    head = null;
}

Node reverse(Node root)
{
    Node prev=null;
    Node curr=root;
    Node nextt;
    while(curr!=null)
    {
        nextt=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextt;
    }

    return prev;
}
////////////////////////////////////////////////////////////////////////
int detectLoop(Node root)
{
    Node slow=root;
    Node fast=root;

    while(slow!=null && fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            return 1;
        }
    }
    return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        LinkedListI l1= new LinkedListI();
        int x=0;
        while(x!=-1)
        {
        x=sc.nextInt();
        if(x!= -1)
        l1.insert(x);
        }
        
        l1.printlist();
        l1.insertAfter(2,91);
        System.out.println("l1.insertAfter(2,91);");
        l1.printlist();
        l1.insertAtEnd(23);
        System.out.println("l1.insertAtEnd(23);");
        l1.printlist();
        l1.delete(91);
        System.out.println("l1.delete(91);");
        l1.printlist();
        System.out.println("count is "+l1.getCount());
       // Node n=new Node(-1);
      Node n = l1.search(l1.head,5);
       if(n==null)
       {
           System.out.println("Not found");
       }
       else
        System.out.println(n.data);
        System.out.println("before swapping");
        l1.printlist();
       l1.swapNode(4,5);
        System.out.println("after swapping");
       l1.printlist();
       Node temp=l1.getNth(l1.head,4);
       if (temp==null) 
       {
           System.out.println("error");
       }
       else
       {
        System.out.println("4th element is"+ temp.data);
       }

       l1.printMiddle(l1.head);
       temp=l1.nthfromLast(l1.head,4);
       if (temp==null) 
       {
           System.out.println("error");
       }
       else
       {
        System.out.println("4th element from last is"+ temp.data);
       }

      System.out.println("freq of 9 is "+l1.freq(l1.head,9));
       
        l1.printlist();
       l1.head=l1.reverse(l1.head);
       l1.printlist();
       l1.deleteList();
       l1.printlist();
        
    }
    
}
