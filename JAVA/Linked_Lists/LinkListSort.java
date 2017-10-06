/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package linklistsort;

import java.util.Scanner;

/**
 *
 * @author mahi
 */
public class LinkListSort {
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
    
    void sortInsert(Node root,int x)
    {
    if(root==null)
    {
    root=new Node(x);
    head=root;
    return;
    }
    else
    {
    Node prev=null;
    Node curr=root;
    while(curr!=null && curr.data >= x)
    {
    prev=curr;
    curr=curr.next;
    }
    Node new1= new Node(x);
    if(prev!=null)
    {
    prev.next=new1;
    new1.next=curr;
    }
    else
    {
    new1.next=root;
    head=new1;
    }
    
    }
    }
    void printlist(Node root)
    {
        Node n=new Node(-1);
        n=root;
    while(n!=null)
    {
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
    }

   Node MergeSortedLists(Node root1, Node root2)
     {
      if (root1 == null) return root2;
      if (root2 == null) return root1;

      if (root1.data > root2.data) {
        root1.next = MergeSortedLists(root1.next, root2);
        return root1;
      }
      else
        {
         root2.next = MergeSortedLists(root1,root2.next);
         return root2;
        }
    }
       
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        LinkListSort l1=new LinkListSort();
        LinkListSort l2=new LinkListSort();
        LinkListSort l3=new LinkListSort();
        LinkListSort l4=new LinkListSort();
       int num=0;
        System.out.println("root1");
       do
       {
        num=sc.nextInt();
        if(num!=-1)
        l1.sortInsert(l1.head, num);
       }while(num!=-1);
       l1.printlist(l1.head);
        System.out.println("root2");
       do
       {
        num=sc.nextInt();
        if(num!=-1)
        l2.sortInsert(l2.head, num);
       }while(num!=-1);

       l2.printlist(l2.head);
       l3.head=l3.MergeSortedLists(l1.head,l2.head);
       l3.printlist(l3.head);
      // l3.MergeSortedLists(l1.head,l2.head);

       
       
    }
    
}
