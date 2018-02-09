import java.util.*;
import java.io.*;
import java.lang.*;
/*
7 2 10 1 3 9 5 8 -1
*/

public class BST {
	class Node{
		int data;
		Node left,right;

		Node(int x){
			data=x;
			left=right=null;
		}

		Node(){
			data=-1;
			left=right=null;
		}
	}

	Node root;
	int levelM=0;

	int[] levels;

	Node insert(Node h,int x){
		Node n=new Node(x);
		// System.out.println("insert");

		if (h==null) {
			h=n;
			return h;
		}
		else if (x<h.data) {
			h.left=insert(h.left,x);
		}
		else {
			h.right=insert(h.right,x);

		}
		return h;
		
	}

	Node delete(Node h,int key){
		if (h==null) {
			return h;
		}
		else if (key<h.data) {
			h.left=delete(h.left,key);
		}
		else if (key>h.data) {
			h.right=delete(h.right,key);
		}
		else {
			if (h.left==null) {
				h=h.right;
			}
			else if (h.right==null) {
				h=h.left;
			}
			else{
				int min=findMin(h.right);
				h.data=min;
				System.out.println(min);
				h.right=delete(h.right,min);
			}
		}
		return h;
	}

	int findMin(Node h){
		if (h==null) {
			return -1;
		}

		while (h.left!=null) {
			h=h.left;
		}
		
		return h.data;
		
	}

	void printBST(Node h){
		// System.out.println("print");
		if (h==null) {
			return ;
		}
		else {
			printBST(h.left);
			System.out.print(h.data+" ");
			printBST(h.right);
		}

	}


	Node LCA(Node h,int x,int y){
		if (x==y || h==null) {
			return search(h,x);
		}
		ArrayList<Integer> ax=new ArrayList<>();
		ArrayList<Integer> ay=new ArrayList<>();
		if (search(h,x)!=null && search(h,y)!=null) {
			Node z=h;
			
			while (z!=null && z.data!= x) {
				if (x<z.data) {
					ax.add(z.data);
					z=z.left;
				}
				else {
					ax.add(z.data);
					z=z.right;
				}
			}

			z=h;
			
			while (z!=null && z.data!= y) {
				if (y<z.data) {
					ay.add(z.data);
					z=z.left;
				}
				else {
					ay.add(z.data);
					z=z.right;
				}
			}
		}

		int i=0;
		System.out.println(ax.size()+" "+ay.size());
		int s=Math.min(ax.size(),ay.size());
		while (i<s-1 && ax.get(i)==ay.get(i)) {
			i++;
		}
		System.out.println(ax.get(i));


		return null;
	}

	void printLeftView(Node h,int level){
		if (h==null) {
			return;
		}
		if (levelM<level) {
			levelM=level;
			System.out.println(h.data+" ");
		}
		
		printLeftView(h.left,level+1);
		printLeftView(h.right,level+1);
	
	}

	// void leftViewUtil(Node node, int level)
 //    {
 //        // Base Case
 //        if (node==null) return;
 
 //        // If this is the first node of its level
 //        if (max_level < level)
 //        {
 //            System.out.print(" " + node.data);
 //            max_level = level;
 //        }
 
 //        // Recur for left and right subtrees
 //        leftViewUtil(node.left, level+1);
 //        leftViewUtil(node.right, level+1);
 //    }

	Node search(Node h,int key){
		if (h==null || h.data==key) {
			return h;
		}
		if (key<h.data)
			return search(h.left,key);
		return search(h.right,key);
		
	}

	int height(Node h){
		if (h==null) {
			return 0;
		}
		else {
			return Math.max((1+height(h.left)),(1+height(h.right)));
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		BST b=new BST();
		while (x!=-1) {
			x=sc.nextInt();
			if (x==-1) {
				break;
			}
			else{
				b.root=b.insert(b.root,x);
			}
		}
		
		// b.printBST(b.root);
		System.out.println();
		// b.LCA(b.root,9,8);
		// System.out.println();


		// int count =0;
		// while (count<b.height(b.root)) {
		// 	printLeftView(b.root,i,b.height(b.root));
		// }
		// b.levels=new int[b.height(b.root)];
		// x=0;
		// for (int k:b.levels ) {
		// 	System.out.println(k);
		// }
		b.printLeftView(b.root,1);

		// b.root=b.delete(b.root,7);
		// b.printBST(b.root);
		// System.out.println();
		// if (b.search(b.root,1)!=null) {
		// 	System.out.println("found 1");
		// }
		// if (b.search(b.root,3)!=null) {
		// 	System.out.println("found 3");
		// }
		// if (b.search(b.root,11)!=null) {
		// 	System.out.println("found 11");
		// }
		// System.out.println(b.height(b.root)-1);
	}
}