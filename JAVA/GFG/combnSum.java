import java.util.*;
import java.lang.*;
import java.io.*;

public class combnSum{
    static ArrayList<List<Integer>> ar;
    //global arraylist of lists
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases count
		while(t-->0)
		{
		    ar=new ArrayList<>();
		    int n=sc.nextInt();//size of array
		    
		    int a[]=new int[n];

		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();//reading the array

		    int sum=sc.nextInt();//reading sum

		    Arrays.sort(a);//sort nlogn

		    LinkedList<Integer> x=new LinkedList<>();//ll

		    sol(a,0,n,sum,x);//array,start,end,sum,linkedlist
		   
		    if(ar.size()==0)//if no combn is found
		    System.out.print("Empty");
		    System.out.println();   
		}
	}

	
	public static void sol(int[] a,int i, int n,int sum,LinkedList<Integer> r)
	{
	    if(sum<0)
	    return;//no -ve sum

	    if(sum==0)//base case of recs
	    {
	    	/////////////////////////////////////////////////////////////////print ll
	        ar.add(r);
	        System.out.print("(");
	            int l=r.size();
		        for(int j=0;j<l-1;j++)
		        {
		            System.out.print(r.get(j)+" ");
		        }
		        
		    System.out.print(r.get(r.size()-1)+")");
		    ////////////////////////////////////////////////////////////////
	        return;
	    }

	    if(i>=n)
	    	return;

	    r.add(a[i]);
	    //System.out.println(r);
	   sol(a,i+1,n,sum-a[i],r);

	   r.removeLast();

	   while(i<(n-1) && a[i]==a[i+1])
	   i++;

	   sol(a,i+1,n,sum,r);
	}
}