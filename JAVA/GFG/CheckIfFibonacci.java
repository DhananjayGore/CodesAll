import java.util.*;
import java.io.*;
import java.lang.*;

public class CheckIfFibonacci {

	static	boolean isFibonacci(int n){
		if (isPerfectSquare((5*n*n) + 4) || isPerfectSquare((5*n*n) - 4)) {
			return true;
		}
		return false;
	}

	static	boolean isPerfectSquare(int n){
		int x=(int)Math.sqrt(n);
		if (x*x == n) {
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();

		System.out.println(isFibonacci(n));
	}
}