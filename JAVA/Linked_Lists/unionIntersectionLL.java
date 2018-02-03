import java.util.*;

class unionIntersectionLL
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

	void insert(Node root,int x)
	{
		Node new1=new Node(x);
		new1.next=head;
		head=new1;
	}

	void printlist(Node root)
	{
		Node p=root;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

	void union(Node root1,Node root2)
	{
		System.out.println("union");
		HashSet<Integer> hs=new HashSet<Integer>();
		// Stack<Integer> s1=new Stack<Integer>();
		while(root1!=null || root2!=null)
		{
			if (root1!=null) 
			{
			hs.add(root1.data);	
			root1=root1.next;
			}
			if (root2!=null) 
			{
			hs.add(root2.data);	
			root2=root2.next;
			}
			
		}

		Iterator<Integer> i=hs.iterator();

		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
	}

	
	void intersect(Node root1,Node root2)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		// Stack<Integer> s1=new Stack<Integer>();
		System.out.println("intersection");
		while(root1!=null )
		{
			if (root1!=null) 
			{
			hs.add(root1.data);	
			}
			root1=root1.next;
		}

		while(root2!=null)
		{
			if (root2!=null) 
			{
			if(hs.contains(root2.data))
				System.out.print(root2.data +" ");
			root2=root2.next;
			}
			
		}



	}
	public static void main(String[] args) {
		unionIntersectionLL l1 =new unionIntersectionLL();
		unionIntersectionLL l2 =new unionIntersectionLL();
		Scanner sc=new Scanner(System.in);
		int x=0;
		while(x!=-1)
		{
			x=sc.nextInt();
			if (x!=-1) {
				l1.insert(l1.head,x);
			}
		}
		x=0;
		while(x!=-1)
		{
			x=sc.nextInt();
			if (x!=-1) {
				l2.insert(l2.head,x);
			}
		}



		l1.printlist(l1.head);
		l2.printlist(l2.head);
		l1.union(l1.head,l2.head);
		l1.intersect(l1.head,l2.head);

	}
	
}