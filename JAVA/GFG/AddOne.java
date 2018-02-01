import java.util.*;
import java.io.*;


public class AddOne
{
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> b=new ArrayList<Integer> ();
		int l=a.size();
		int k,carry;
		if (l==1) {
			// System.out.println(a.get(0));
			k=a.get(0)+1;
			// System.out.println(k);
			b.add(k);
		}
		else
		{
			int i=l-1;
			carry=1;
			while(i>=0){
				k=a.get(i)+carry;
				// System.out.println(k+" "+carry+" ");
				if (k >= 10) {
					
					carry=k/10;
					k=k%10;
				}
				else{
					carry=0;
				}
				b.add(k);
				// System.out.println(k);
				i--;
			}
		}
		return b;
	}


	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer> ();

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();

		int i=0,n=0;
		while(i<x)
		{
			n=sc.nextInt();
			a.add(i,n);
			i++;
		}

		i=0;
		//System.out.print(a.size());
		ArrayList<Integer> b=new ArrayList<Integer> ();
		b=plusOne(a);

		i=0;
		x=b.size()-1;

		while(x>=0)
		{
			System.out.print(b.get(x));
			x--;
		}


	}
}