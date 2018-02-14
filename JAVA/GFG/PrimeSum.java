import java.util.*;
import java.lang.*;
import java.io.*;

public class PrimeSum{
//A Number and a pair of primes to sum it
static void finder(int t){
	int i=1,flag=0;
	while(i <= t/2){

		if (prime(i) && prime(t-i)) {
			// System.out.println("Yes with"+ i+" "+(t-i));
			System.out.println("Yes");
			flag=1;
			break;
		}
		i=i+1;
	}
	if (flag==0) {
		System.out.println("No");
	}
	
}

static boolean prime(int i)
{
	int k=0,count=0;
	boolean result=true;
	if (i==2) {
		return true;
	}
	for (k=2;k<Math.sqrt(i);k++) {
		if (i%k==0) {
			count++;
			if (count==1) {
				return false;
			}
		}
	}
	return result;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		for (int i=0;i<t;i++) {
			int k=0;
			k=sc.nextInt();
			finder(k);
		}
		
		// System.out.print(prime(k));


	}
	
}