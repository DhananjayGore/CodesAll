import java.util.*;
import java.io.*;
import java.lang.*;

public class PrimeFactors{
	
	static ArrayList<Integer> prime(int x){
			ArrayList<Integer> al=new ArrayList<Integer>();
		//all factors of 2
		while(x%2==0){
			// System.out.print(2+" ");
			al.add(2);
			x/=2;
		}

		for (int i=3;i<Math.sqrt(x);i+=2) {
			while(x%i==0) {
				// System.out.print(i+" ");//all factors of i
				al.add(i);
				x/=i;
			}
		}

		//if it has no divisor in the previous range, it mean it is prime;

		if (x > 2) {
			// System.out.println(x);
			al.add(x);
		}

		return al;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		a=prime(x);

		Iterator it=a.iterator();

		while(it.hasNext()){
			System.out.print(it.next() +" ");
		}
	}
}
	
