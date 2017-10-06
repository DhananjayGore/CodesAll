import java.util.*;
//incomplete
class flattenLL 
{
class Node 
{
	int data;
	Node right;
	Node down;

	Node(int x)
	{
		data=x;
		right=null;
		down=null;
	}
}	
Node head;

void insertR(Node root,int x)
{
		Node new1=new Node(x);
		new1.right=root;
		head=new1;
}

void insertD(Node root,int x)
{
		Node new1=new Node(x);
		new1.down=root;
		root=new1;
}

void printlistR(Node root)
{
	Node p=root;
	while(p!=null)
	{
		System.out.println(p.data + " ");
		printlistD(p.down);
		p=p.right;
	}
	//System.out.println("r");
}

void printlistD(Node root)
{
	Node p=root;
	while(p.down!=null)
	{
		if(p.down!=null)
		System.out.print(p.data + " ");
		p=p.down;
	}
	//System.out.println("d");
}

public static void main(String[] args) {
	flattenLL l=new flattenLL();
	// Scanner sc=new Scanner(System.in);
	// int x=0;
	Node temp=l.head;
	// while(x!=-2)
	// {
	// 	x=sc.nextInt();
	// 	l.insertR(l.head,x);
	// 	x=0;
	// 	while(x!=-1)
	// 	{
	// 	x=sc.nextInt();
	// 	l.insertD(temp,x);
	// 	}
	// 	// temp=temp.right;
	// }
	l.insertR(l.head,1);

	//l.insertD(temp,2);
	// l.insertD(temp,3);
	// l.insertD(temp,4);
	// l.insertD(temp,5);
	
	l.insertR(l.head,6);
	// temp=l.head;
	// l.insertD(temp,7);
	// l.insertD(temp,8);
	// l.insertD(temp,9);
	// l.insertD(temp,0);

	l.insertR(l.head,11);

	l.printlistR(l.head);




	l.printlistR(l.head);
}

}